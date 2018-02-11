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

import com.zscat.shop.domain.UserconfigDO;
import com.zscat.shop.service.UserconfigService;
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
@RequestMapping("/shop/userconfig")
public class UserconfigController {
	@Autowired
	private UserconfigService userconfigService;
	
	@GetMapping()
	@RequiresPermissions("shop:userconfig:userconfig")
	String Userconfig(){
	    return "shop/userconfig/userconfig";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:userconfig:userconfig")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UserconfigDO> userconfigList = userconfigService.list(query);
		int total = userconfigService.count(query);
		PageUtils pageUtils = new PageUtils(userconfigList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:userconfig:add")
	String add(){
	    return "shop/userconfig/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:userconfig:edit")
	String edit(@PathVariable("id") Long id,Model model){
		UserconfigDO userconfig = userconfigService.get(id);
		model.addAttribute("userconfig", userconfig);
	    return "shop/userconfig/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:userconfig:add")
	public R save( UserconfigDO userconfig){
		if(userconfigService.save(userconfig)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:userconfig:edit")
	public R update( UserconfigDO userconfig){
		userconfigService.update(userconfig);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:userconfig:remove")
	public R remove( Long id){
		if(userconfigService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:userconfig:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		userconfigService.batchRemove(ids);
		return R.ok();
	}
	
}
