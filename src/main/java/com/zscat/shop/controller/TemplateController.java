package com.zscat.shop.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zscat.shop.domain.TemplateDO;
import com.zscat.shop.service.TemplateService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
 
@Controller
@RequestMapping("/shop/template")
public class TemplateController {
	@Autowired
	private TemplateService templateService;
	
	@GetMapping()
	@RequiresPermissions("shop:template:template")
	String Template(){
	    return "shop/template/template";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:template:template")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TemplateDO> templateList = templateService.list(query);
		int total = templateService.count(query);
		PageUtils pageUtils = new PageUtils(templateList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:template:add")
	String add(){
	    return "shop/template/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:template:edit")
	String edit(@PathVariable("id") Long id,Model model){
		TemplateDO template = templateService.get(id);
		model.addAttribute("template", template);
	    return "shop/template/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:template:add")
	public R save( TemplateDO template){
		if(templateService.save(template)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:template:edit")
	public R update( TemplateDO template){
		templateService.update(template);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:template:remove")
	public R remove( Long id){
		if(templateService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:template:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		templateService.batchRemove(ids);
		return R.ok();
	}
	
}
