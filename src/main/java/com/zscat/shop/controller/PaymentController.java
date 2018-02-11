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

import com.zscat.shop.domain.PaymentDO;
import com.zscat.shop.service.PaymentService;
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
@RequestMapping("/shop/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping()
	@RequiresPermissions("shop:payment:payment")
	String Payment(){
	    return "shop/payment/payment";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:payment:payment")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PaymentDO> paymentList = paymentService.list(query);
		int total = paymentService.count(query);
		PageUtils pageUtils = new PageUtils(paymentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:payment:add")
	String add(){
	    return "shop/payment/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:payment:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PaymentDO payment = paymentService.get(id);
		model.addAttribute("payment", payment);
	    return "shop/payment/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:payment:add")
	public R save( PaymentDO payment){
		if(paymentService.save(payment)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:payment:edit")
	public R update( PaymentDO payment){
		paymentService.update(payment);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:payment:remove")
	public R remove( Long id){
		if(paymentService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:payment:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		paymentService.batchRemove(ids);
		return R.ok();
	}
	
}
