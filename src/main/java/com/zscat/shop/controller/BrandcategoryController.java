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

import com.zscat.shop.domain.BrandcategoryDO;
import com.zscat.shop.service.BrandcategoryService;
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
@RequestMapping("/shop/brandcategory")
public class BrandcategoryController {
	@Autowired
	private BrandcategoryService brandcategoryService;
	
	@GetMapping()
	@RequiresPermissions("shop:brandcategory:brandcategory")
	String Brandcategory(){
	    return "shop/brandcategory/brandcategory";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:brandcategory:brandcategory")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<BrandcategoryDO> brandcategoryList = brandcategoryService.list(query);
		int total = brandcategoryService.count(query);
		PageUtils pageUtils = new PageUtils(brandcategoryList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:brandcategory:add")
	String add(){
	    return "shop/brandcategory/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:brandcategory:edit")
	String edit(@PathVariable("id") Long id,Model model){
		BrandcategoryDO brandcategory = brandcategoryService.get(id);
		model.addAttribute("brandcategory", brandcategory);
	    return "shop/brandcategory/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:brandcategory:add")
	public R save( BrandcategoryDO brandcategory){
		if(brandcategoryService.save(brandcategory)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:brandcategory:edit")
	public R update( BrandcategoryDO brandcategory){
		brandcategoryService.update(brandcategory);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:brandcategory:remove")
	public R remove( Long id){
		if(brandcategoryService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:brandcategory:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		brandcategoryService.batchRemove(ids);
		return R.ok();
	}
	
}
