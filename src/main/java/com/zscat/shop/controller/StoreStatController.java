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

import com.zscat.shop.domain.StoreStatDO;
import com.zscat.shop.service.StoreStatService;
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
@RequestMapping("/shop/storeStat")
public class StoreStatController {
	@Autowired
	private StoreStatService storeStatService;
	
	@GetMapping()
	@RequiresPermissions("shop:storeStat:storeStat")
	String StoreStat(){
	    return "shop/storeStat/storeStat";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storeStat:storeStat")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StoreStatDO> storeStatList = storeStatService.list(query);
		int total = storeStatService.count(query);
		PageUtils pageUtils = new PageUtils(storeStatList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storeStat:add")
	String add(){
	    return "shop/storeStat/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storeStat:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StoreStatDO storeStat = storeStatService.get(id);
		model.addAttribute("storeStat", storeStat);
	    return "shop/storeStat/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storeStat:add")
	public R save( StoreStatDO storeStat){
		if(storeStatService.save(storeStat)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storeStat:edit")
	public R update( StoreStatDO storeStat){
		storeStatService.update(storeStat);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storeStat:remove")
	public R remove( Long id){
		if(storeStatService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storeStat:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storeStatService.batchRemove(ids);
		return R.ok();
	}
	
}
