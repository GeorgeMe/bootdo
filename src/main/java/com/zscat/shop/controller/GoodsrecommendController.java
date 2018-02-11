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

import com.zscat.shop.domain.GoodsrecommendDO;
import com.zscat.shop.service.GoodsrecommendService;
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
@RequestMapping("/shop/goodsrecommend")
public class GoodsrecommendController {
	@Autowired
	private GoodsrecommendService goodsrecommendService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsrecommend:goodsrecommend")
	String Goodsrecommend(){
	    return "shop/goodsrecommend/goodsrecommend";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsrecommend:goodsrecommend")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsrecommendDO> goodsrecommendList = goodsrecommendService.list(query);
		int total = goodsrecommendService.count(query);
		PageUtils pageUtils = new PageUtils(goodsrecommendList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsrecommend:add")
	String add(){
	    return "shop/goodsrecommend/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsrecommend:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsrecommendDO goodsrecommend = goodsrecommendService.get(id);
		model.addAttribute("goodsrecommend", goodsrecommend);
	    return "shop/goodsrecommend/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsrecommend:add")
	public R save( GoodsrecommendDO goodsrecommend){
		if(goodsrecommendService.save(goodsrecommend)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsrecommend:edit")
	public R update( GoodsrecommendDO goodsrecommend){
		goodsrecommendService.update(goodsrecommend);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsrecommend:remove")
	public R remove( Long id){
		if(goodsrecommendService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsrecommend:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsrecommendService.batchRemove(ids);
		return R.ok();
	}
	
}
