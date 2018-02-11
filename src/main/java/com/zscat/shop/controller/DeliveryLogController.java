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

import com.zscat.shop.domain.DeliveryLogDO;
import com.zscat.shop.service.DeliveryLogService;
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
@RequestMapping("/shop/deliveryLog")
public class DeliveryLogController {
	@Autowired
	private DeliveryLogService deliveryLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:deliveryLog:deliveryLog")
	String DeliveryLog(){
	    return "shop/deliveryLog/deliveryLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:deliveryLog:deliveryLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DeliveryLogDO> deliveryLogList = deliveryLogService.list(query);
		int total = deliveryLogService.count(query);
		PageUtils pageUtils = new PageUtils(deliveryLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:deliveryLog:add")
	String add(){
	    return "shop/deliveryLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:deliveryLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		DeliveryLogDO deliveryLog = deliveryLogService.get(id);
		model.addAttribute("deliveryLog", deliveryLog);
	    return "shop/deliveryLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:deliveryLog:add")
	public R save( DeliveryLogDO deliveryLog){
		if(deliveryLogService.save(deliveryLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:deliveryLog:edit")
	public R update( DeliveryLogDO deliveryLog){
		deliveryLogService.update(deliveryLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:deliveryLog:remove")
	public R remove( Long id){
		if(deliveryLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:deliveryLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		deliveryLogService.batchRemove(ids);
		return R.ok();
	}
	
}
