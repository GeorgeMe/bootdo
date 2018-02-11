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

import com.zscat.shop.domain.GoodsReturnDO;
import com.zscat.shop.service.GoodsReturnService;
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
@RequestMapping("/shop/goodsReturn")
public class GoodsReturnController {
	@Autowired
	private GoodsReturnService goodsReturnService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsReturn:goodsReturn")
	String GoodsReturn(){
	    return "shop/goodsReturn/goodsReturn";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsReturn:goodsReturn")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsReturnDO> goodsReturnList = goodsReturnService.list(query);
		int total = goodsReturnService.count(query);
		PageUtils pageUtils = new PageUtils(goodsReturnList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsReturn:add")
	String add(){
	    return "shop/goodsReturn/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsReturn:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsReturnDO goodsReturn = goodsReturnService.get(id);
		model.addAttribute("goodsReturn", goodsReturn);
	    return "shop/goodsReturn/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsReturn:add")
	public R save( GoodsReturnDO goodsReturn){
		if(goodsReturnService.save(goodsReturn)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsReturn:edit")
	public R update( GoodsReturnDO goodsReturn){
		goodsReturnService.update(goodsReturn);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsReturn:remove")
	public R remove( Long id){
		if(goodsReturnService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsReturn:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsReturnService.batchRemove(ids);
		return R.ok();
	}
	
}
