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

import com.zscat.shop.domain.CartGspDO;
import com.zscat.shop.service.CartGspService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
 
@Controller
@RequestMapping("/shop/cartGsp")
public class CartGspController {
	@Autowired
	private CartGspService cartGspService;
	
	@GetMapping()
	@RequiresPermissions("shop:cartGsp:cartGsp")
	String CartGsp(){
	    return "shop/cartGsp/cartGsp";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:cartGsp:cartGsp")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CartGspDO> cartGspList = cartGspService.list(query);
		int total = cartGspService.count(query);
		PageUtils pageUtils = new PageUtils(cartGspList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:cartGsp:add")
	String add(){
	    return "shop/cartGsp/add";
	}

	@GetMapping("/edit/{cartId}")
	@RequiresPermissions("shop:cartGsp:edit")
	String edit(@PathVariable("cartId") Long cartId,Model model){
		CartGspDO cartGsp = cartGspService.get(cartId);
		model.addAttribute("cartGsp", cartGsp);
	    return "shop/cartGsp/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:cartGsp:add")
	public R save( CartGspDO cartGsp){
		if(cartGspService.save(cartGsp)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:cartGsp:edit")
	public R update( CartGspDO cartGsp){
		cartGspService.update(cartGsp);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:cartGsp:remove")
	public R remove( Long cartId){
		if(cartGspService.remove(cartId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:cartGsp:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] cartIds){
		cartGspService.batchRemove(cartIds);
		return R.ok();
	}
	
}
