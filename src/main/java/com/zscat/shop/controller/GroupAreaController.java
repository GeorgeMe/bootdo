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

import com.zscat.shop.domain.GroupAreaDO;
import com.zscat.shop.service.GroupAreaService;
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
@RequestMapping("/shop/groupArea")
public class GroupAreaController {
	@Autowired
	private GroupAreaService groupAreaService;
	
	@GetMapping()
	@RequiresPermissions("shop:groupArea:groupArea")
	String GroupArea(){
	    return "shop/groupArea/groupArea";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:groupArea:groupArea")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GroupAreaDO> groupAreaList = groupAreaService.list(query);
		int total = groupAreaService.count(query);
		PageUtils pageUtils = new PageUtils(groupAreaList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:groupArea:add")
	String add(){
	    return "shop/groupArea/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:groupArea:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GroupAreaDO groupArea = groupAreaService.get(id);
		model.addAttribute("groupArea", groupArea);
	    return "shop/groupArea/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:groupArea:add")
	public R save( GroupAreaDO groupArea){
		if(groupAreaService.save(groupArea)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:groupArea:edit")
	public R update( GroupAreaDO groupArea){
		groupAreaService.update(groupArea);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:groupArea:remove")
	public R remove( Long id){
		if(groupAreaService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:groupArea:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		groupAreaService.batchRemove(ids);
		return R.ok();
	}
	
}
