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

import com.zscat.shop.domain.WatermarkDO;
import com.zscat.shop.service.WatermarkService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
 
@Controller
@RequestMapping("/shop/watermark")
public class WatermarkController {
	@Autowired
	private WatermarkService watermarkService;
	
	@GetMapping()
	@RequiresPermissions("shop:watermark:watermark")
	String Watermark(){
	    return "shop/watermark/watermark";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:watermark:watermark")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WatermarkDO> watermarkList = watermarkService.list(query);
		int total = watermarkService.count(query);
		PageUtils pageUtils = new PageUtils(watermarkList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:watermark:add")
	String add(){
	    return "shop/watermark/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:watermark:edit")
	String edit(@PathVariable("id") Long id,Model model){
		WatermarkDO watermark = watermarkService.get(id);
		model.addAttribute("watermark", watermark);
	    return "shop/watermark/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:watermark:add")
	public R save( WatermarkDO watermark){
		if(watermarkService.save(watermark)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:watermark:edit")
	public R update( WatermarkDO watermark){
		watermarkService.update(watermark);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:watermark:remove")
	public R remove( Long id){
		if(watermarkService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:watermark:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		watermarkService.batchRemove(ids);
		return R.ok();
	}
	
}
