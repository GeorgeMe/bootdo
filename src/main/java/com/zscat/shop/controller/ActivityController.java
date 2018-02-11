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

import com.zscat.shop.domain.ActivityDO;
import com.zscat.shop.service.ActivityService;
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
@RequestMapping("/shop/activity")
public class ActivityController {
	@Autowired
	private ActivityService activityService;
	
	@GetMapping()
	@RequiresPermissions("shop:activity:activity")
	String Activity(){
	    return "shop/activity/activity";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:activity:activity")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ActivityDO> activityList = activityService.list(query);
		int total = activityService.count(query);
		PageUtils pageUtils = new PageUtils(activityList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:activity:add")
	String add(){
	    return "shop/activity/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:activity:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ActivityDO activity = activityService.get(id);
		model.addAttribute("activity", activity);
	    return "shop/activity/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:activity:add")
	public R save( ActivityDO activity){
		if(activityService.save(activity)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:activity:edit")
	public R update( ActivityDO activity){
		activityService.update(activity);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:activity:remove")
	public R remove( Long id){
		if(activityService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:activity:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		activityService.batchRemove(ids);
		return R.ok();
	}
	
}
