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

import com.zscat.shop.domain.StoreSlideDO;
import com.zscat.shop.service.StoreSlideService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
 
@Controller
@RequestMapping("/shop/storeSlide")
public class StoreSlideController {
	@Autowired
	private StoreSlideService storeSlideService;
	
	@GetMapping()
	@RequiresPermissions("shop:storeSlide:storeSlide")
	String StoreSlide(){
	    return "shop/storeSlide/storeSlide";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storeSlide:storeSlide")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StoreSlideDO> storeSlideList = storeSlideService.list(query);
		int total = storeSlideService.count(query);
		PageUtils pageUtils = new PageUtils(storeSlideList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storeSlide:add")
	String add(){
	    return "shop/storeSlide/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storeSlide:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StoreSlideDO storeSlide = storeSlideService.get(id);
		model.addAttribute("storeSlide", storeSlide);
	    return "shop/storeSlide/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storeSlide:add")
	public R save( StoreSlideDO storeSlide){
		if(storeSlideService.save(storeSlide)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storeSlide:edit")
	public R update( StoreSlideDO storeSlide){
		storeSlideService.update(storeSlide);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storeSlide:remove")
	public R remove( Long id){
		if(storeSlideService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storeSlide:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storeSlideService.batchRemove(ids);
		return R.ok();
	}
	
}
