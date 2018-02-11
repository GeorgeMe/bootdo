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

import com.zscat.shop.domain.TransportDO;
import com.zscat.shop.service.TransportService;
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
@RequestMapping("/shop/transport")
public class TransportController {
	@Autowired
	private TransportService transportService;
	
	@GetMapping()
	@RequiresPermissions("shop:transport:transport")
	String Transport(){
	    return "shop/transport/transport";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:transport:transport")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TransportDO> transportList = transportService.list(query);
		int total = transportService.count(query);
		PageUtils pageUtils = new PageUtils(transportList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:transport:add")
	String add(){
	    return "shop/transport/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:transport:edit")
	String edit(@PathVariable("id") Long id,Model model){
		TransportDO transport = transportService.get(id);
		model.addAttribute("transport", transport);
	    return "shop/transport/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:transport:add")
	public R save( TransportDO transport){
		if(transportService.save(transport)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:transport:edit")
	public R update( TransportDO transport){
		transportService.update(transport);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:transport:remove")
	public R remove( Long id){
		if(transportService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:transport:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		transportService.batchRemove(ids);
		return R.ok();
	}
	
}
