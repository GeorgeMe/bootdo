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

import com.zscat.shop.domain.GoodsclassstapleDO;
import com.zscat.shop.service.GoodsclassstapleService;
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
@RequestMapping("/shop/goodsclassstaple")
public class GoodsclassstapleController {
	@Autowired
	private GoodsclassstapleService goodsclassstapleService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsclassstaple:goodsclassstaple")
	String Goodsclassstaple(){
	    return "shop/goodsclassstaple/goodsclassstaple";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsclassstaple:goodsclassstaple")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsclassstapleDO> goodsclassstapleList = goodsclassstapleService.list(query);
		int total = goodsclassstapleService.count(query);
		PageUtils pageUtils = new PageUtils(goodsclassstapleList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsclassstaple:add")
	String add(){
	    return "shop/goodsclassstaple/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsclassstaple:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsclassstapleDO goodsclassstaple = goodsclassstapleService.get(id);
		model.addAttribute("goodsclassstaple", goodsclassstaple);
	    return "shop/goodsclassstaple/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsclassstaple:add")
	public R save( GoodsclassstapleDO goodsclassstaple){
		if(goodsclassstapleService.save(goodsclassstaple)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsclassstaple:edit")
	public R update( GoodsclassstapleDO goodsclassstaple){
		goodsclassstapleService.update(goodsclassstaple);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsclassstaple:remove")
	public R remove( Long id){
		if(goodsclassstapleService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsclassstaple:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsclassstapleService.batchRemove(ids);
		return R.ok();
	}
	
}
