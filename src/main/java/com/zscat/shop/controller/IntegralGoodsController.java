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

import com.zscat.shop.domain.IntegralGoodsDO;
import com.zscat.shop.service.IntegralGoodsService;
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
@RequestMapping("/shop/integralGoods")
public class IntegralGoodsController {
	@Autowired
	private IntegralGoodsService integralGoodsService;
	
	@GetMapping()
	@RequiresPermissions("shop:integralGoods:integralGoods")
	String IntegralGoods(){
	    return "shop/integralGoods/integralGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:integralGoods:integralGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IntegralGoodsDO> integralGoodsList = integralGoodsService.list(query);
		int total = integralGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(integralGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:integralGoods:add")
	String add(){
	    return "shop/integralGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:integralGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		IntegralGoodsDO integralGoods = integralGoodsService.get(id);
		model.addAttribute("integralGoods", integralGoods);
	    return "shop/integralGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:integralGoods:add")
	public R save( IntegralGoodsDO integralGoods){
		if(integralGoodsService.save(integralGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:integralGoods:edit")
	public R update( IntegralGoodsDO integralGoods){
		integralGoodsService.update(integralGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:integralGoods:remove")
	public R remove( Long id){
		if(integralGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:integralGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		integralGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
