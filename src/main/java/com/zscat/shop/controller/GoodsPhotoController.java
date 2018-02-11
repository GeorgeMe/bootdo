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

import com.zscat.shop.domain.GoodsPhotoDO;
import com.zscat.shop.service.GoodsPhotoService;
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
@RequestMapping("/shop/goodsPhoto")
public class GoodsPhotoController {
	@Autowired
	private GoodsPhotoService goodsPhotoService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsPhoto:goodsPhoto")
	String GoodsPhoto(){
	    return "shop/goodsPhoto/goodsPhoto";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsPhoto:goodsPhoto")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsPhotoDO> goodsPhotoList = goodsPhotoService.list(query);
		int total = goodsPhotoService.count(query);
		PageUtils pageUtils = new PageUtils(goodsPhotoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsPhoto:add")
	String add(){
	    return "shop/goodsPhoto/add";
	}

	@GetMapping("/edit/{goodsId}")
	@RequiresPermissions("shop:goodsPhoto:edit")
	String edit(@PathVariable("goodsId") Long goodsId,Model model){
		GoodsPhotoDO goodsPhoto = goodsPhotoService.get(goodsId);
		model.addAttribute("goodsPhoto", goodsPhoto);
	    return "shop/goodsPhoto/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsPhoto:add")
	public R save( GoodsPhotoDO goodsPhoto){
		if(goodsPhotoService.save(goodsPhoto)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsPhoto:edit")
	public R update( GoodsPhotoDO goodsPhoto){
		goodsPhotoService.update(goodsPhoto);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsPhoto:remove")
	public R remove( Long goodsId){
		if(goodsPhotoService.remove(goodsId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsPhoto:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] goodsIds){
		goodsPhotoService.batchRemove(goodsIds);
		return R.ok();
	}
	
}
