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

import com.zscat.shop.domain.StoreNavDO;
import com.zscat.shop.service.StoreNavService;
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
@RequestMapping("/shop/storeNav")
public class StoreNavController {
	@Autowired
	private StoreNavService storeNavService;
	
	@GetMapping()
	@RequiresPermissions("shop:storeNav:storeNav")
	String StoreNav(){
	    return "shop/storeNav/storeNav";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storeNav:storeNav")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StoreNavDO> storeNavList = storeNavService.list(query);
		int total = storeNavService.count(query);
		PageUtils pageUtils = new PageUtils(storeNavList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storeNav:add")
	String add(){
	    return "shop/storeNav/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storeNav:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StoreNavDO storeNav = storeNavService.get(id);
		model.addAttribute("storeNav", storeNav);
	    return "shop/storeNav/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storeNav:add")
	public R save( StoreNavDO storeNav){
		if(storeNavService.save(storeNav)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storeNav:edit")
	public R update( StoreNavDO storeNav){
		storeNavService.update(storeNav);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storeNav:remove")
	public R remove( Long id){
		if(storeNavService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storeNav:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storeNavService.batchRemove(ids);
		return R.ok();
	}
	
}
