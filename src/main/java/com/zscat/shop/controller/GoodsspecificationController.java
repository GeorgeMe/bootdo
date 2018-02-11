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

import com.zscat.shop.domain.GoodsspecificationDO;
import com.zscat.shop.service.GoodsspecificationService;
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
@RequestMapping("/shop/goodsspecification")
public class GoodsspecificationController {
	@Autowired
	private GoodsspecificationService goodsspecificationService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsspecification:goodsspecification")
	String Goodsspecification(){
	    return "shop/goodsspecification/goodsspecification";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsspecification:goodsspecification")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsspecificationDO> goodsspecificationList = goodsspecificationService.list(query);
		int total = goodsspecificationService.count(query);
		PageUtils pageUtils = new PageUtils(goodsspecificationList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsspecification:add")
	String add(){
	    return "shop/goodsspecification/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsspecification:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsspecificationDO goodsspecification = goodsspecificationService.get(id);
		model.addAttribute("goodsspecification", goodsspecification);
	    return "shop/goodsspecification/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsspecification:add")
	public R save( GoodsspecificationDO goodsspecification){
		if(goodsspecificationService.save(goodsspecification)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsspecification:edit")
	public R update( GoodsspecificationDO goodsspecification){
		goodsspecificationService.update(goodsspecification);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsspecification:remove")
	public R remove( Long id){
		if(goodsspecificationService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsspecification:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsspecificationService.batchRemove(ids);
		return R.ok();
	}
	
}
