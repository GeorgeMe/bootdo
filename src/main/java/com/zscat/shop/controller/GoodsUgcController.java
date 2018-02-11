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

import com.zscat.shop.domain.GoodsUgcDO;
import com.zscat.shop.service.GoodsUgcService;
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
@RequestMapping("/shop/goodsUgc")
public class GoodsUgcController {
	@Autowired
	private GoodsUgcService goodsUgcService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsUgc:goodsUgc")
	String GoodsUgc(){
	    return "shop/goodsUgc/goodsUgc";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsUgc:goodsUgc")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsUgcDO> goodsUgcList = goodsUgcService.list(query);
		int total = goodsUgcService.count(query);
		PageUtils pageUtils = new PageUtils(goodsUgcList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsUgc:add")
	String add(){
	    return "shop/goodsUgc/add";
	}

	@GetMapping("/edit/{goodsId}")
	@RequiresPermissions("shop:goodsUgc:edit")
	String edit(@PathVariable("goodsId") Long goodsId,Model model){
		GoodsUgcDO goodsUgc = goodsUgcService.get(goodsId);
		model.addAttribute("goodsUgc", goodsUgc);
	    return "shop/goodsUgc/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsUgc:add")
	public R save( GoodsUgcDO goodsUgc){
		if(goodsUgcService.save(goodsUgc)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsUgc:edit")
	public R update( GoodsUgcDO goodsUgc){
		goodsUgcService.update(goodsUgc);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsUgc:remove")
	public R remove( Long goodsId){
		if(goodsUgcService.remove(goodsId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsUgc:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] goodsIds){
		goodsUgcService.batchRemove(goodsIds);
		return R.ok();
	}
	
}
