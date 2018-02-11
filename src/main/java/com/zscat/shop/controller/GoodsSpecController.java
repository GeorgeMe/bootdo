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

import com.zscat.shop.domain.GoodsSpecDO;
import com.zscat.shop.service.GoodsSpecService;
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
@RequestMapping("/shop/goodsSpec")
public class GoodsSpecController {
	@Autowired
	private GoodsSpecService goodsSpecService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsSpec:goodsSpec")
	String GoodsSpec(){
	    return "shop/goodsSpec/goodsSpec";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsSpec:goodsSpec")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsSpecDO> goodsSpecList = goodsSpecService.list(query);
		int total = goodsSpecService.count(query);
		PageUtils pageUtils = new PageUtils(goodsSpecList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsSpec:add")
	String add(){
	    return "shop/goodsSpec/add";
	}

	@GetMapping("/edit/{goodsId}")
	@RequiresPermissions("shop:goodsSpec:edit")
	String edit(@PathVariable("goodsId") Long goodsId,Model model){
		GoodsSpecDO goodsSpec = goodsSpecService.get(goodsId);
		model.addAttribute("goodsSpec", goodsSpec);
	    return "shop/goodsSpec/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsSpec:add")
	public R save( GoodsSpecDO goodsSpec){
		if(goodsSpecService.save(goodsSpec)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsSpec:edit")
	public R update( GoodsSpecDO goodsSpec){
		goodsSpecService.update(goodsSpec);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsSpec:remove")
	public R remove( Long goodsId){
		if(goodsSpecService.remove(goodsId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsSpec:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] goodsIds){
		goodsSpecService.batchRemove(goodsIds);
		return R.ok();
	}
	
}
