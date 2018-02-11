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

import com.zscat.shop.domain.GoodsReturnlogDO;
import com.zscat.shop.service.GoodsReturnlogService;
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
@RequestMapping("/shop/goodsReturnlog")
public class GoodsReturnlogController {
	@Autowired
	private GoodsReturnlogService goodsReturnlogService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsReturnlog:goodsReturnlog")
	String GoodsReturnlog(){
	    return "shop/goodsReturnlog/goodsReturnlog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsReturnlog:goodsReturnlog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsReturnlogDO> goodsReturnlogList = goodsReturnlogService.list(query);
		int total = goodsReturnlogService.count(query);
		PageUtils pageUtils = new PageUtils(goodsReturnlogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsReturnlog:add")
	String add(){
	    return "shop/goodsReturnlog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsReturnlog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsReturnlogDO goodsReturnlog = goodsReturnlogService.get(id);
		model.addAttribute("goodsReturnlog", goodsReturnlog);
	    return "shop/goodsReturnlog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsReturnlog:add")
	public R save( GoodsReturnlogDO goodsReturnlog){
		if(goodsReturnlogService.save(goodsReturnlog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsReturnlog:edit")
	public R update( GoodsReturnlogDO goodsReturnlog){
		goodsReturnlogService.update(goodsReturnlog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsReturnlog:remove")
	public R remove( Long id){
		if(goodsReturnlogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsReturnlog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsReturnlogService.batchRemove(ids);
		return R.ok();
	}
	
}
