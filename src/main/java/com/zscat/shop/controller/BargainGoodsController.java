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

import com.zscat.shop.domain.BargainGoodsDO;
import com.zscat.shop.service.BargainGoodsService;
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
@RequestMapping("/shop/bargainGoods")
public class BargainGoodsController {
	@Autowired
	private BargainGoodsService bargainGoodsService;
	
	@GetMapping()
	@RequiresPermissions("shop:bargainGoods:bargainGoods")
	String BargainGoods(){
	    return "shop/bargainGoods/bargainGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:bargainGoods:bargainGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<BargainGoodsDO> bargainGoodsList = bargainGoodsService.list(query);
		int total = bargainGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(bargainGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:bargainGoods:add")
	String add(){
	    return "shop/bargainGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:bargainGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		BargainGoodsDO bargainGoods = bargainGoodsService.get(id);
		model.addAttribute("bargainGoods", bargainGoods);
	    return "shop/bargainGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:bargainGoods:add")
	public R save( BargainGoodsDO bargainGoods){
		if(bargainGoodsService.save(bargainGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:bargainGoods:edit")
	public R update( BargainGoodsDO bargainGoods){
		bargainGoodsService.update(bargainGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:bargainGoods:remove")
	public R remove( Long id){
		if(bargainGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:bargainGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		bargainGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
