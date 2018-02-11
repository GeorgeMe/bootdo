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

import com.zscat.shop.domain.AdvertDO;
import com.zscat.shop.service.AdvertService;
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
@RequestMapping("/shop/advert")
public class AdvertController {
	@Autowired
	private AdvertService advertService;
	
	@GetMapping()
	@RequiresPermissions("shop:advert:advert")
	String Advert(){
	    return "shop/advert/advert";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:advert:advert")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AdvertDO> advertList = advertService.list(query);
		int total = advertService.count(query);
		PageUtils pageUtils = new PageUtils(advertList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:advert:add")
	String add(){
	    return "shop/advert/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:advert:edit")
	String edit(@PathVariable("id") Long id,Model model){
		AdvertDO advert = advertService.get(id);
		model.addAttribute("advert", advert);
	    return "shop/advert/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:advert:add")
	public R save( AdvertDO advert){
		if(advertService.save(advert)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:advert:edit")
	public R update( AdvertDO advert){
		advertService.update(advert);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:advert:remove")
	public R remove( Long id){
		if(advertService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:advert:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		advertService.batchRemove(ids);
		return R.ok();
	}
	
}
