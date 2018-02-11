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

import com.zscat.shop.domain.DynamicDO;
import com.zscat.shop.service.DynamicService;
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
@RequestMapping("/shop/dynamic")
public class DynamicController {
	@Autowired
	private DynamicService dynamicService;
	
	@GetMapping()
	@RequiresPermissions("shop:dynamic:dynamic")
	String Dynamic(){
	    return "shop/dynamic/dynamic";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:dynamic:dynamic")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DynamicDO> dynamicList = dynamicService.list(query);
		int total = dynamicService.count(query);
		PageUtils pageUtils = new PageUtils(dynamicList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:dynamic:add")
	String add(){
	    return "shop/dynamic/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:dynamic:edit")
	String edit(@PathVariable("id") Long id,Model model){
		DynamicDO dynamic = dynamicService.get(id);
		model.addAttribute("dynamic", dynamic);
	    return "shop/dynamic/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:dynamic:add")
	public R save( DynamicDO dynamic){
		if(dynamicService.save(dynamic)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:dynamic:edit")
	public R update( DynamicDO dynamic){
		dynamicService.update(dynamic);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:dynamic:remove")
	public R remove( Long id){
		if(dynamicService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:dynamic:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		dynamicService.batchRemove(ids);
		return R.ok();
	}
	
}
