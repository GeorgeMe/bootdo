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

import com.zscat.shop.domain.NavigationDO;
import com.zscat.shop.service.NavigationService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
 
@Controller
@RequestMapping("/shop/navigation")
public class NavigationController {
	@Autowired
	private NavigationService navigationService;
	
	@GetMapping()
	@RequiresPermissions("shop:navigation:navigation")
	String Navigation(){
	    return "shop/navigation/navigation";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:navigation:navigation")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<NavigationDO> navigationList = navigationService.list(query);
		int total = navigationService.count(query);
		PageUtils pageUtils = new PageUtils(navigationList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:navigation:add")
	String add(){
	    return "shop/navigation/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:navigation:edit")
	String edit(@PathVariable("id") Long id,Model model){
		NavigationDO navigation = navigationService.get(id);
		model.addAttribute("navigation", navigation);
	    return "shop/navigation/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:navigation:add")
	public R save( NavigationDO navigation){
		if(navigationService.save(navigation)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:navigation:edit")
	public R update( NavigationDO navigation){
		navigationService.update(navigation);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:navigation:remove")
	public R remove( Long id){
		if(navigationService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:navigation:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		navigationService.batchRemove(ids);
		return R.ok();
	}
	
}
