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

import com.zscat.shop.domain.GoldLogDO;
import com.zscat.shop.service.GoldLogService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
 
@Controller
@RequestMapping("/shop/goldLog")
public class GoldLogController {
	@Autowired
	private GoldLogService goldLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:goldLog:goldLog")
	String GoldLog(){
	    return "shop/goldLog/goldLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goldLog:goldLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoldLogDO> goldLogList = goldLogService.list(query);
		int total = goldLogService.count(query);
		PageUtils pageUtils = new PageUtils(goldLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goldLog:add")
	String add(){
	    return "shop/goldLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goldLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoldLogDO goldLog = goldLogService.get(id);
		model.addAttribute("goldLog", goldLog);
	    return "shop/goldLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goldLog:add")
	public R save( GoldLogDO goldLog){
		if(goldLogService.save(goldLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goldLog:edit")
	public R update( GoldLogDO goldLog){
		goldLogService.update(goldLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goldLog:remove")
	public R remove( Long id){
		if(goldLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goldLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goldLogService.batchRemove(ids);
		return R.ok();
	}
	
}
