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

import com.zscat.shop.domain.HomepageDO;
import com.zscat.shop.service.HomepageService;
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
@RequestMapping("/shop/homepage")
public class HomepageController {
	@Autowired
	private HomepageService homepageService;
	
	@GetMapping()
	@RequiresPermissions("shop:homepage:homepage")
	String Homepage(){
	    return "shop/homepage/homepage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:homepage:homepage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HomepageDO> homepageList = homepageService.list(query);
		int total = homepageService.count(query);
		PageUtils pageUtils = new PageUtils(homepageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:homepage:add")
	String add(){
	    return "shop/homepage/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:homepage:edit")
	String edit(@PathVariable("id") Long id,Model model){
		HomepageDO homepage = homepageService.get(id);
		model.addAttribute("homepage", homepage);
	    return "shop/homepage/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:homepage:add")
	public R save( HomepageDO homepage){
		if(homepageService.save(homepage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:homepage:edit")
	public R update( HomepageDO homepage){
		homepageService.update(homepage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:homepage:remove")
	public R remove( Long id){
		if(homepageService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:homepage:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		homepageService.batchRemove(ids);
		return R.ok();
	}
	
}
