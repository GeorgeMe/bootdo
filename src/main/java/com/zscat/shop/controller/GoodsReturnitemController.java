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

import com.zscat.shop.domain.GoodsReturnitemDO;
import com.zscat.shop.service.GoodsReturnitemService;
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
@RequestMapping("/shop/goodsReturnitem")
public class GoodsReturnitemController {
	@Autowired
	private GoodsReturnitemService goodsReturnitemService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsReturnitem:goodsReturnitem")
	String GoodsReturnitem(){
	    return "shop/goodsReturnitem/goodsReturnitem";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsReturnitem:goodsReturnitem")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsReturnitemDO> goodsReturnitemList = goodsReturnitemService.list(query);
		int total = goodsReturnitemService.count(query);
		PageUtils pageUtils = new PageUtils(goodsReturnitemList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsReturnitem:add")
	String add(){
	    return "shop/goodsReturnitem/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsReturnitem:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsReturnitemDO goodsReturnitem = goodsReturnitemService.get(id);
		model.addAttribute("goodsReturnitem", goodsReturnitem);
	    return "shop/goodsReturnitem/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsReturnitem:add")
	public R save( GoodsReturnitemDO goodsReturnitem){
		if(goodsReturnitemService.save(goodsReturnitem)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsReturnitem:edit")
	public R update( GoodsReturnitemDO goodsReturnitem){
		goodsReturnitemService.update(goodsReturnitem);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsReturnitem:remove")
	public R remove( Long id){
		if(goodsReturnitemService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsReturnitem:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsReturnitemService.batchRemove(ids);
		return R.ok();
	}
	
}
