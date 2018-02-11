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

import com.zscat.shop.domain.GroupPriceRangeDO;
import com.zscat.shop.service.GroupPriceRangeService;
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
@RequestMapping("/shop/groupPriceRange")
public class GroupPriceRangeController {
	@Autowired
	private GroupPriceRangeService groupPriceRangeService;
	
	@GetMapping()
	@RequiresPermissions("shop:groupPriceRange:groupPriceRange")
	String GroupPriceRange(){
	    return "shop/groupPriceRange/groupPriceRange";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:groupPriceRange:groupPriceRange")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GroupPriceRangeDO> groupPriceRangeList = groupPriceRangeService.list(query);
		int total = groupPriceRangeService.count(query);
		PageUtils pageUtils = new PageUtils(groupPriceRangeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:groupPriceRange:add")
	String add(){
	    return "shop/groupPriceRange/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:groupPriceRange:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GroupPriceRangeDO groupPriceRange = groupPriceRangeService.get(id);
		model.addAttribute("groupPriceRange", groupPriceRange);
	    return "shop/groupPriceRange/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:groupPriceRange:add")
	public R save( GroupPriceRangeDO groupPriceRange){
		if(groupPriceRangeService.save(groupPriceRange)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:groupPriceRange:edit")
	public R update( GroupPriceRangeDO groupPriceRange){
		groupPriceRangeService.update(groupPriceRange);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:groupPriceRange:remove")
	public R remove( Long id){
		if(groupPriceRangeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:groupPriceRange:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		groupPriceRangeService.batchRemove(ids);
		return R.ok();
	}
	
}
