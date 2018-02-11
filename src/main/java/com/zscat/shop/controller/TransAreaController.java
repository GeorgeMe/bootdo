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

import com.zscat.shop.domain.TransAreaDO;
import com.zscat.shop.service.TransAreaService;
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
@RequestMapping("/shop/transArea")
public class TransAreaController {
	@Autowired
	private TransAreaService transAreaService;
	
	@GetMapping()
	@RequiresPermissions("shop:transArea:transArea")
	String TransArea(){
	    return "shop/transArea/transArea";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:transArea:transArea")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TransAreaDO> transAreaList = transAreaService.list(query);
		int total = transAreaService.count(query);
		PageUtils pageUtils = new PageUtils(transAreaList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:transArea:add")
	String add(){
	    return "shop/transArea/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:transArea:edit")
	String edit(@PathVariable("id") Long id,Model model){
		TransAreaDO transArea = transAreaService.get(id);
		model.addAttribute("transArea", transArea);
	    return "shop/transArea/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:transArea:add")
	public R save( TransAreaDO transArea){
		if(transAreaService.save(transArea)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:transArea:edit")
	public R update( TransAreaDO transArea){
		transAreaService.update(transArea);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:transArea:remove")
	public R remove( Long id){
		if(transAreaService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:transArea:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		transAreaService.batchRemove(ids);
		return R.ok();
	}
	
}
