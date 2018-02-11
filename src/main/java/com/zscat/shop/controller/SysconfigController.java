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

import com.zscat.shop.domain.SysconfigDO;
import com.zscat.shop.service.SysconfigService;
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
@RequestMapping("/shop/sysconfig")
public class SysconfigController {
	@Autowired
	private SysconfigService sysconfigService;
	
	@GetMapping()
	@RequiresPermissions("shop:sysconfig:sysconfig")
	String Sysconfig(){
	    return "shop/sysconfig/sysconfig";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:sysconfig:sysconfig")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SysconfigDO> sysconfigList = sysconfigService.list(query);
		int total = sysconfigService.count(query);
		PageUtils pageUtils = new PageUtils(sysconfigList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:sysconfig:add")
	String add(){
	    return "shop/sysconfig/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:sysconfig:edit")
	String edit(@PathVariable("id") Long id,Model model){
		SysconfigDO sysconfig = sysconfigService.get(id);
		model.addAttribute("sysconfig", sysconfig);
	    return "shop/sysconfig/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:sysconfig:add")
	public R save( SysconfigDO sysconfig){
		if(sysconfigService.save(sysconfig)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:sysconfig:edit")
	public R update( SysconfigDO sysconfig){
		sysconfigService.update(sysconfig);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:sysconfig:remove")
	public R remove( Long id){
		if(sysconfigService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:sysconfig:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		sysconfigService.batchRemove(ids);
		return R.ok();
	}
	
}
