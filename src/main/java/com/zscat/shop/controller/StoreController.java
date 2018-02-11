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

import com.zscat.shop.domain.StoreDO;
import com.zscat.shop.service.StoreService;
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
@RequestMapping("/shop/store")
public class StoreController {
	@Autowired
	private StoreService storeService;
	
	@GetMapping()
	@RequiresPermissions("shop:store:store")
	String Store(){
	    return "shop/store/store";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:store:store")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StoreDO> storeList = storeService.list(query);
		int total = storeService.count(query);
		PageUtils pageUtils = new PageUtils(storeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:store:add")
	String add(){
	    return "shop/store/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:store:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StoreDO store = storeService.get(id);
		model.addAttribute("store", store);
	    return "shop/store/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:store:add")
	public R save( StoreDO store){
		if(storeService.save(store)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:store:edit")
	public R update( StoreDO store){
		storeService.update(store);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:store:remove")
	public R remove( Long id){
		if(storeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:store:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storeService.batchRemove(ids);
		return R.ok();
	}
	
}
