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

import com.zscat.shop.domain.ConsultDO;
import com.zscat.shop.service.ConsultService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
 
@Controller
@RequestMapping("/shop/consult")
public class ConsultController {
	@Autowired
	private ConsultService consultService;
	
	@GetMapping()
	@RequiresPermissions("shop:consult:consult")
	String Consult(){
	    return "shop/consult/consult";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:consult:consult")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ConsultDO> consultList = consultService.list(query);
		int total = consultService.count(query);
		PageUtils pageUtils = new PageUtils(consultList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:consult:add")
	String add(){
	    return "shop/consult/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:consult:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ConsultDO consult = consultService.get(id);
		model.addAttribute("consult", consult);
	    return "shop/consult/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:consult:add")
	public R save( ConsultDO consult){
		if(consultService.save(consult)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:consult:edit")
	public R update( ConsultDO consult){
		consultService.update(consult);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:consult:remove")
	public R remove( Long id){
		if(consultService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:consult:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		consultService.batchRemove(ids);
		return R.ok();
	}
	
}
