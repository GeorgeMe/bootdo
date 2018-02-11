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

import com.zscat.shop.domain.SpareGoodsfloorDO;
import com.zscat.shop.service.SpareGoodsfloorService;
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
@RequestMapping("/shop/spareGoodsfloor")
public class SpareGoodsfloorController {
	@Autowired
	private SpareGoodsfloorService spareGoodsfloorService;
	
	@GetMapping()
	@RequiresPermissions("shop:spareGoodsfloor:spareGoodsfloor")
	String SpareGoodsfloor(){
	    return "shop/spareGoodsfloor/spareGoodsfloor";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:spareGoodsfloor:spareGoodsfloor")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SpareGoodsfloorDO> spareGoodsfloorList = spareGoodsfloorService.list(query);
		int total = spareGoodsfloorService.count(query);
		PageUtils pageUtils = new PageUtils(spareGoodsfloorList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:spareGoodsfloor:add")
	String add(){
	    return "shop/spareGoodsfloor/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:spareGoodsfloor:edit")
	String edit(@PathVariable("id") Long id,Model model){
		SpareGoodsfloorDO spareGoodsfloor = spareGoodsfloorService.get(id);
		model.addAttribute("spareGoodsfloor", spareGoodsfloor);
	    return "shop/spareGoodsfloor/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:spareGoodsfloor:add")
	public R save( SpareGoodsfloorDO spareGoodsfloor){
		if(spareGoodsfloorService.save(spareGoodsfloor)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:spareGoodsfloor:edit")
	public R update( SpareGoodsfloorDO spareGoodsfloor){
		spareGoodsfloorService.update(spareGoodsfloor);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:spareGoodsfloor:remove")
	public R remove( Long id){
		if(spareGoodsfloorService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:spareGoodsfloor:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		spareGoodsfloorService.batchRemove(ids);
		return R.ok();
	}
	
}
