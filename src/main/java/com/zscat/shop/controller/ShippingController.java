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

import com.zscat.shop.domain.ShippingDO;
import com.zscat.shop.service.ShippingService;
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
@RequestMapping("/shop/shipping")
public class ShippingController {
	@Autowired
	private ShippingService shippingService;
	
	@GetMapping()
	@RequiresPermissions("shop:shipping:shipping")
	String Shipping(){
	    return "shop/shipping/shipping";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:shipping:shipping")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ShippingDO> shippingList = shippingService.list(query);
		int total = shippingService.count(query);
		PageUtils pageUtils = new PageUtils(shippingList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:shipping:add")
	String add(){
	    return "shop/shipping/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:shipping:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ShippingDO shipping = shippingService.get(id);
		model.addAttribute("shipping", shipping);
	    return "shop/shipping/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:shipping:add")
	public R save( ShippingDO shipping){
		if(shippingService.save(shipping)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:shipping:edit")
	public R update( ShippingDO shipping){
		shippingService.update(shipping);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:shipping:remove")
	public R remove( Long id){
		if(shippingService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:shipping:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		shippingService.batchRemove(ids);
		return R.ok();
	}
	
}
