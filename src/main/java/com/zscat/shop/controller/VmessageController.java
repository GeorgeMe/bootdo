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

import com.zscat.shop.domain.VmessageDO;
import com.zscat.shop.service.VmessageService;
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
@RequestMapping("/shop/vmessage")
public class VmessageController {
	@Autowired
	private VmessageService vmessageService;
	
	@GetMapping()
	@RequiresPermissions("shop:vmessage:vmessage")
	String Vmessage(){
	    return "shop/vmessage/vmessage";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:vmessage:vmessage")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<VmessageDO> vmessageList = vmessageService.list(query);
		int total = vmessageService.count(query);
		PageUtils pageUtils = new PageUtils(vmessageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:vmessage:add")
	String add(){
	    return "shop/vmessage/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:vmessage:edit")
	String edit(@PathVariable("id") Long id,Model model){
		VmessageDO vmessage = vmessageService.get(id);
		model.addAttribute("vmessage", vmessage);
	    return "shop/vmessage/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:vmessage:add")
	public R save( VmessageDO vmessage){
		if(vmessageService.save(vmessage)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:vmessage:edit")
	public R update( VmessageDO vmessage){
		vmessageService.update(vmessage);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:vmessage:remove")
	public R remove( Long id){
		if(vmessageService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:vmessage:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		vmessageService.batchRemove(ids);
		return R.ok();
	}
	
}
