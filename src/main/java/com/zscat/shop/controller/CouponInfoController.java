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

import com.zscat.shop.domain.CouponInfoDO;
import com.zscat.shop.service.CouponInfoService;
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
@RequestMapping("/shop/couponInfo")
public class CouponInfoController {
	@Autowired
	private CouponInfoService couponInfoService;
	
	@GetMapping()
	@RequiresPermissions("shop:couponInfo:couponInfo")
	String CouponInfo(){
	    return "shop/couponInfo/couponInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:couponInfo:couponInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CouponInfoDO> couponInfoList = couponInfoService.list(query);
		int total = couponInfoService.count(query);
		PageUtils pageUtils = new PageUtils(couponInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:couponInfo:add")
	String add(){
	    return "shop/couponInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:couponInfo:edit")
	String edit(@PathVariable("id") Long id,Model model){
		CouponInfoDO couponInfo = couponInfoService.get(id);
		model.addAttribute("couponInfo", couponInfo);
	    return "shop/couponInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:couponInfo:add")
	public R save( CouponInfoDO couponInfo){
		if(couponInfoService.save(couponInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:couponInfo:edit")
	public R update( CouponInfoDO couponInfo){
		couponInfoService.update(couponInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:couponInfo:remove")
	public R remove( Long id){
		if(couponInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:couponInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		couponInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
