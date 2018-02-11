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

import com.zscat.shop.domain.PredepositLogDO;
import com.zscat.shop.service.PredepositLogService;
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
@RequestMapping("/shop/predepositLog")
public class PredepositLogController {
	@Autowired
	private PredepositLogService predepositLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:predepositLog:predepositLog")
	String PredepositLog(){
	    return "shop/predepositLog/predepositLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:predepositLog:predepositLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PredepositLogDO> predepositLogList = predepositLogService.list(query);
		int total = predepositLogService.count(query);
		PageUtils pageUtils = new PageUtils(predepositLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:predepositLog:add")
	String add(){
	    return "shop/predepositLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:predepositLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PredepositLogDO predepositLog = predepositLogService.get(id);
		model.addAttribute("predepositLog", predepositLog);
	    return "shop/predepositLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:predepositLog:add")
	public R save( PredepositLogDO predepositLog){
		if(predepositLogService.save(predepositLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:predepositLog:edit")
	public R update( PredepositLogDO predepositLog){
		predepositLogService.update(predepositLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:predepositLog:remove")
	public R remove( Long id){
		if(predepositLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:predepositLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		predepositLogService.batchRemove(ids);
		return R.ok();
	}
	
}
