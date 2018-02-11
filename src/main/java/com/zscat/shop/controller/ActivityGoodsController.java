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

import com.zscat.shop.domain.ActivityGoodsDO;
import com.zscat.shop.service.ActivityGoodsService;
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
@RequestMapping("/shop/activityGoods")
public class ActivityGoodsController {
	@Autowired
	private ActivityGoodsService activityGoodsService;
	
	@GetMapping()
	@RequiresPermissions("shop:activityGoods:activityGoods")
	String ActivityGoods(){
	    return "shop/activityGoods/activityGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:activityGoods:activityGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ActivityGoodsDO> activityGoodsList = activityGoodsService.list(query);
		int total = activityGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(activityGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:activityGoods:add")
	String add(){
	    return "shop/activityGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:activityGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ActivityGoodsDO activityGoods = activityGoodsService.get(id);
		model.addAttribute("activityGoods", activityGoods);
	    return "shop/activityGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:activityGoods:add")
	public R save( ActivityGoodsDO activityGoods){
		if(activityGoodsService.save(activityGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:activityGoods:edit")
	public R update( ActivityGoodsDO activityGoods){
		activityGoodsService.update(activityGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:activityGoods:remove")
	public R remove( Long id){
		if(activityGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:activityGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		activityGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
