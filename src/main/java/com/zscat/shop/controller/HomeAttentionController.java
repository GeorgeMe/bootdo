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

import com.zscat.shop.domain.HomeAttentionDO;
import com.zscat.shop.service.HomeAttentionService;
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
@RequestMapping("/shop/homeAttention")
public class HomeAttentionController {
	@Autowired
	private HomeAttentionService homeAttentionService;
	
	@GetMapping()
	@RequiresPermissions("shop:homeAttention:homeAttention")
	String HomeAttention(){
	    return "shop/homeAttention/homeAttention";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:homeAttention:homeAttention")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HomeAttentionDO> homeAttentionList = homeAttentionService.list(query);
		int total = homeAttentionService.count(query);
		PageUtils pageUtils = new PageUtils(homeAttentionList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:homeAttention:add")
	String add(){
	    return "shop/homeAttention/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:homeAttention:edit")
	String edit(@PathVariable("id") Long id,Model model){
		HomeAttentionDO homeAttention = homeAttentionService.get(id);
		model.addAttribute("homeAttention", homeAttention);
	    return "shop/homeAttention/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:homeAttention:add")
	public R save( HomeAttentionDO homeAttention){
		if(homeAttentionService.save(homeAttention)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:homeAttention:edit")
	public R update( HomeAttentionDO homeAttention){
		homeAttentionService.update(homeAttention);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:homeAttention:remove")
	public R remove( Long id){
		if(homeAttentionService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:homeAttention:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		homeAttentionService.batchRemove(ids);
		return R.ok();
	}
	
}
