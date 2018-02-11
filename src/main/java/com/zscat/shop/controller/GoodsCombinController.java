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

import com.zscat.shop.domain.GoodsCombinDO;
import com.zscat.shop.service.GoodsCombinService;
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
@RequestMapping("/shop/goodsCombin")
public class GoodsCombinController {
	@Autowired
	private GoodsCombinService goodsCombinService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsCombin:goodsCombin")
	String GoodsCombin(){
	    return "shop/goodsCombin/goodsCombin";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsCombin:goodsCombin")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsCombinDO> goodsCombinList = goodsCombinService.list(query);
		int total = goodsCombinService.count(query);
		PageUtils pageUtils = new PageUtils(goodsCombinList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsCombin:add")
	String add(){
	    return "shop/goodsCombin/add";
	}

	@GetMapping("/edit/{wemallGoodsId}")
	@RequiresPermissions("shop:goodsCombin:edit")
	String edit(@PathVariable("wemallGoodsId") Long wemallGoodsId,Model model){
		GoodsCombinDO goodsCombin = goodsCombinService.get(wemallGoodsId);
		model.addAttribute("goodsCombin", goodsCombin);
	    return "shop/goodsCombin/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsCombin:add")
	public R save( GoodsCombinDO goodsCombin){
		if(goodsCombinService.save(goodsCombin)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsCombin:edit")
	public R update( GoodsCombinDO goodsCombin){
		goodsCombinService.update(goodsCombin);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsCombin:remove")
	public R remove( Long wemallGoodsId){
		if(goodsCombinService.remove(wemallGoodsId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsCombin:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] wemallGoodsIds){
		goodsCombinService.batchRemove(wemallGoodsIds);
		return R.ok();
	}
	
}
