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

import com.zscat.shop.domain.OrderformDO;
import com.zscat.shop.service.OrderformService;
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
@RequestMapping("/shop/orderform")
public class OrderformController {
	@Autowired
	private OrderformService orderformService;
	
	@GetMapping()
	@RequiresPermissions("shop:orderform:orderform")
	String Orderform(){
	    return "shop/orderform/orderform";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:orderform:orderform")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<OrderformDO> orderformList = orderformService.list(query);
		int total = orderformService.count(query);
		PageUtils pageUtils = new PageUtils(orderformList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:orderform:add")
	String add(){
	    return "shop/orderform/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:orderform:edit")
	String edit(@PathVariable("id") Long id,Model model){
		OrderformDO orderform = orderformService.get(id);
		model.addAttribute("orderform", orderform);
	    return "shop/orderform/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:orderform:add")
	public R save( OrderformDO orderform){
		if(orderformService.save(orderform)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:orderform:edit")
	public R update( OrderformDO orderform){
		orderformService.update(orderform);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:orderform:remove")
	public R remove( Long id){
		if(orderformService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:orderform:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		orderformService.batchRemove(ids);
		return R.ok();
	}
	
}
