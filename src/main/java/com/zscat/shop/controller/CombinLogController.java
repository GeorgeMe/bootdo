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

import com.zscat.shop.domain.CombinLogDO;
import com.zscat.shop.service.CombinLogService;
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
@RequestMapping("/shop/combinLog")
public class CombinLogController {
	@Autowired
	private CombinLogService combinLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:combinLog:combinLog")
	String CombinLog(){
	    return "shop/combinLog/combinLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:combinLog:combinLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CombinLogDO> combinLogList = combinLogService.list(query);
		int total = combinLogService.count(query);
		PageUtils pageUtils = new PageUtils(combinLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:combinLog:add")
	String add(){
	    return "shop/combinLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:combinLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		CombinLogDO combinLog = combinLogService.get(id);
		model.addAttribute("combinLog", combinLog);
	    return "shop/combinLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:combinLog:add")
	public R save( CombinLogDO combinLog){
		if(combinLogService.save(combinLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:combinLog:edit")
	public R update( CombinLogDO combinLog){
		combinLogService.update(combinLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:combinLog:remove")
	public R remove( Long id){
		if(combinLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:combinLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		combinLogService.batchRemove(ids);
		return R.ok();
	}
	
}
