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

import com.zscat.shop.domain.ZtcGoldLogDO;
import com.zscat.shop.service.ZtcGoldLogService;
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
@RequestMapping("/shop/ztcGoldLog")
public class ZtcGoldLogController {
	@Autowired
	private ZtcGoldLogService ztcGoldLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:ztcGoldLog:ztcGoldLog")
	String ZtcGoldLog(){
	    return "shop/ztcGoldLog/ztcGoldLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:ztcGoldLog:ztcGoldLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ZtcGoldLogDO> ztcGoldLogList = ztcGoldLogService.list(query);
		int total = ztcGoldLogService.count(query);
		PageUtils pageUtils = new PageUtils(ztcGoldLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:ztcGoldLog:add")
	String add(){
	    return "shop/ztcGoldLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:ztcGoldLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ZtcGoldLogDO ztcGoldLog = ztcGoldLogService.get(id);
		model.addAttribute("ztcGoldLog", ztcGoldLog);
	    return "shop/ztcGoldLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:ztcGoldLog:add")
	public R save( ZtcGoldLogDO ztcGoldLog){
		if(ztcGoldLogService.save(ztcGoldLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:ztcGoldLog:edit")
	public R update( ZtcGoldLogDO ztcGoldLog){
		ztcGoldLogService.update(ztcGoldLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:ztcGoldLog:remove")
	public R remove( Long id){
		if(ztcGoldLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:ztcGoldLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		ztcGoldLogService.batchRemove(ids);
		return R.ok();
	}
	
}
