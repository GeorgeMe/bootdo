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

import com.zscat.shop.domain.AccessoryDO;
import com.zscat.shop.service.AccessoryService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
 
@Controller
@RequestMapping("/shop/accessory")
public class AccessoryController {
	@Autowired
	private AccessoryService accessoryService;
	
	@GetMapping()
	@RequiresPermissions("shop:accessory:accessory")
	String Accessory(){
	    return "shop/accessory/accessory";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:accessory:accessory")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AccessoryDO> accessoryList = accessoryService.list(query);
		int total = accessoryService.count(query);
		PageUtils pageUtils = new PageUtils(accessoryList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:accessory:add")
	String add(){
	    return "shop/accessory/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:accessory:edit")
	String edit(@PathVariable("id") Long id,Model model){
		AccessoryDO accessory = accessoryService.get(id);
		model.addAttribute("accessory", accessory);
	    return "shop/accessory/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:accessory:add")
	public R save( AccessoryDO accessory){
		if(accessoryService.save(accessory)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:accessory:edit")
	public R update( AccessoryDO accessory){
		accessoryService.update(accessory);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:accessory:remove")
	public R remove( Long id){
		if(accessoryService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:accessory:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		accessoryService.batchRemove(ids);
		return R.ok();
	}
	
}
