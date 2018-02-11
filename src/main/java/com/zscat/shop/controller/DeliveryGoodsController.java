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

import com.zscat.shop.domain.DeliveryGoodsDO;
import com.zscat.shop.service.DeliveryGoodsService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
 
@Controller
@RequestMapping("/shop/deliveryGoods")
public class DeliveryGoodsController {
	@Autowired
	private DeliveryGoodsService deliveryGoodsService;
	
	@GetMapping()
	@RequiresPermissions("shop:deliveryGoods:deliveryGoods")
	String DeliveryGoods(){
	    return "shop/deliveryGoods/deliveryGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:deliveryGoods:deliveryGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DeliveryGoodsDO> deliveryGoodsList = deliveryGoodsService.list(query);
		int total = deliveryGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(deliveryGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:deliveryGoods:add")
	String add(){
	    return "shop/deliveryGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:deliveryGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		DeliveryGoodsDO deliveryGoods = deliveryGoodsService.get(id);
		model.addAttribute("deliveryGoods", deliveryGoods);
	    return "shop/deliveryGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:deliveryGoods:add")
	public R save( DeliveryGoodsDO deliveryGoods){
		if(deliveryGoodsService.save(deliveryGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:deliveryGoods:edit")
	public R update( DeliveryGoodsDO deliveryGoods){
		deliveryGoodsService.update(deliveryGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:deliveryGoods:remove")
	public R remove( Long id){
		if(deliveryGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:deliveryGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		deliveryGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
