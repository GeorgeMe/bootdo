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

import com.zscat.shop.domain.GoodsspecpropertyDO;
import com.zscat.shop.service.GoodsspecpropertyService;
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
@RequestMapping("/shop/goodsspecproperty")
public class GoodsspecpropertyController {
	@Autowired
	private GoodsspecpropertyService goodsspecpropertyService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsspecproperty:goodsspecproperty")
	String Goodsspecproperty(){
	    return "shop/goodsspecproperty/goodsspecproperty";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsspecproperty:goodsspecproperty")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsspecpropertyDO> goodsspecpropertyList = goodsspecpropertyService.list(query);
		int total = goodsspecpropertyService.count(query);
		PageUtils pageUtils = new PageUtils(goodsspecpropertyList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsspecproperty:add")
	String add(){
	    return "shop/goodsspecproperty/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsspecproperty:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsspecpropertyDO goodsspecproperty = goodsspecpropertyService.get(id);
		model.addAttribute("goodsspecproperty", goodsspecproperty);
	    return "shop/goodsspecproperty/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsspecproperty:add")
	public R save( GoodsspecpropertyDO goodsspecproperty){
		if(goodsspecpropertyService.save(goodsspecproperty)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsspecproperty:edit")
	public R update( GoodsspecpropertyDO goodsspecproperty){
		goodsspecpropertyService.update(goodsspecproperty);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsspecproperty:remove")
	public R remove( Long id){
		if(goodsspecpropertyService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsspecproperty:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsspecpropertyService.batchRemove(ids);
		return R.ok();
	}
	
}
