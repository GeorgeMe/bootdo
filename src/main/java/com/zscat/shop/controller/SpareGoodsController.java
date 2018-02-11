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

import com.zscat.shop.domain.SpareGoodsDO;
import com.zscat.shop.service.SpareGoodsService;
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
@RequestMapping("/shop/spareGoods")
public class SpareGoodsController {
	@Autowired
	private SpareGoodsService spareGoodsService;
	
	@GetMapping()
	@RequiresPermissions("shop:spareGoods:spareGoods")
	String SpareGoods(){
	    return "shop/spareGoods/spareGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:spareGoods:spareGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SpareGoodsDO> spareGoodsList = spareGoodsService.list(query);
		int total = spareGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(spareGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:spareGoods:add")
	String add(){
	    return "shop/spareGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:spareGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		SpareGoodsDO spareGoods = spareGoodsService.get(id);
		model.addAttribute("spareGoods", spareGoods);
	    return "shop/spareGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:spareGoods:add")
	public R save( SpareGoodsDO spareGoods){
		if(spareGoodsService.save(spareGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:spareGoods:edit")
	public R update( SpareGoodsDO spareGoods){
		spareGoodsService.update(spareGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:spareGoods:remove")
	public R remove( Long id){
		if(spareGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:spareGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		spareGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
