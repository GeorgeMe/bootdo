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

import com.zscat.shop.domain.StorePointDO;
import com.zscat.shop.service.StorePointService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
 
@Controller
@RequestMapping("/shop/storePoint")
public class StorePointController {
	@Autowired
	private StorePointService storePointService;
	
	@GetMapping()
	@RequiresPermissions("shop:storePoint:storePoint")
	String StorePoint(){
	    return "shop/storePoint/storePoint";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storePoint:storePoint")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StorePointDO> storePointList = storePointService.list(query);
		int total = storePointService.count(query);
		PageUtils pageUtils = new PageUtils(storePointList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storePoint:add")
	String add(){
	    return "shop/storePoint/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storePoint:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StorePointDO storePoint = storePointService.get(id);
		model.addAttribute("storePoint", storePoint);
	    return "shop/storePoint/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storePoint:add")
	public R save( StorePointDO storePoint){
		if(storePointService.save(storePoint)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storePoint:edit")
	public R update( StorePointDO storePoint){
		storePointService.update(storePoint);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storePoint:remove")
	public R remove( Long id){
		if(storePointService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storePoint:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storePointService.batchRemove(ids);
		return R.ok();
	}
	
}
