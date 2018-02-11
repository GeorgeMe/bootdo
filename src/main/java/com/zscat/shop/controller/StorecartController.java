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

import com.zscat.shop.domain.StorecartDO;
import com.zscat.shop.service.StorecartService;
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
@RequestMapping("/shop/storecart")
public class StorecartController {
	@Autowired
	private StorecartService storecartService;
	
	@GetMapping()
	@RequiresPermissions("shop:storecart:storecart")
	String Storecart(){
	    return "shop/storecart/storecart";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storecart:storecart")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StorecartDO> storecartList = storecartService.list(query);
		int total = storecartService.count(query);
		PageUtils pageUtils = new PageUtils(storecartList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storecart:add")
	String add(){
	    return "shop/storecart/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storecart:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StorecartDO storecart = storecartService.get(id);
		model.addAttribute("storecart", storecart);
	    return "shop/storecart/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storecart:add")
	public R save( StorecartDO storecart){
		if(storecartService.save(storecart)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storecart:edit")
	public R update( StorecartDO storecart){
		storecartService.update(storecart);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storecart:remove")
	public R remove( Long id){
		if(storecartService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storecart:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storecartService.batchRemove(ids);
		return R.ok();
	}
	
}
