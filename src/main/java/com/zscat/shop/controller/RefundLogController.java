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

import com.zscat.shop.domain.RefundLogDO;
import com.zscat.shop.service.RefundLogService;
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
@RequestMapping("/shop/refundLog")
public class RefundLogController {
	@Autowired
	private RefundLogService refundLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:refundLog:refundLog")
	String RefundLog(){
	    return "shop/refundLog/refundLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:refundLog:refundLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RefundLogDO> refundLogList = refundLogService.list(query);
		int total = refundLogService.count(query);
		PageUtils pageUtils = new PageUtils(refundLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:refundLog:add")
	String add(){
	    return "shop/refundLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:refundLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		RefundLogDO refundLog = refundLogService.get(id);
		model.addAttribute("refundLog", refundLog);
	    return "shop/refundLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:refundLog:add")
	public R save( RefundLogDO refundLog){
		if(refundLogService.save(refundLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:refundLog:edit")
	public R update( RefundLogDO refundLog){
		refundLogService.update(refundLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:refundLog:remove")
	public R remove( Long id){
		if(refundLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:refundLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		refundLogService.batchRemove(ids);
		return R.ok();
	}
	
}
