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

import com.zscat.shop.domain.StoregradeLogDO;
import com.zscat.shop.service.StoregradeLogService;
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
@RequestMapping("/shop/storegradeLog")
public class StoregradeLogController {
	@Autowired
	private StoregradeLogService storegradeLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:storegradeLog:storegradeLog")
	String StoregradeLog(){
	    return "shop/storegradeLog/storegradeLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storegradeLog:storegradeLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StoregradeLogDO> storegradeLogList = storegradeLogService.list(query);
		int total = storegradeLogService.count(query);
		PageUtils pageUtils = new PageUtils(storegradeLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storegradeLog:add")
	String add(){
	    return "shop/storegradeLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storegradeLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StoregradeLogDO storegradeLog = storegradeLogService.get(id);
		model.addAttribute("storegradeLog", storegradeLog);
	    return "shop/storegradeLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storegradeLog:add")
	public R save( StoregradeLogDO storegradeLog){
		if(storegradeLogService.save(storegradeLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storegradeLog:edit")
	public R update( StoregradeLogDO storegradeLog){
		storegradeLogService.update(storegradeLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storegradeLog:remove")
	public R remove( Long id){
		if(storegradeLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storegradeLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storegradeLogService.batchRemove(ids);
		return R.ok();
	}
	
}
