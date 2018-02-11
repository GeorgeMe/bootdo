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

import com.zscat.shop.domain.VmenuDO;
import com.zscat.shop.service.VmenuService;
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
@RequestMapping("/shop/vmenu")
public class VmenuController {
	@Autowired
	private VmenuService vmenuService;
	
	@GetMapping()
	@RequiresPermissions("shop:vmenu:vmenu")
	String Vmenu(){
	    return "shop/vmenu/vmenu";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:vmenu:vmenu")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<VmenuDO> vmenuList = vmenuService.list(query);
		int total = vmenuService.count(query);
		PageUtils pageUtils = new PageUtils(vmenuList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:vmenu:add")
	String add(){
	    return "shop/vmenu/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:vmenu:edit")
	String edit(@PathVariable("id") Long id,Model model){
		VmenuDO vmenu = vmenuService.get(id);
		model.addAttribute("vmenu", vmenu);
	    return "shop/vmenu/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:vmenu:add")
	public R save( VmenuDO vmenu){
		if(vmenuService.save(vmenu)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:vmenu:edit")
	public R update( VmenuDO vmenu){
		vmenuService.update(vmenu);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:vmenu:remove")
	public R remove( Long id){
		if(vmenuService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:vmenu:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		vmenuService.batchRemove(ids);
		return R.ok();
	}
	
}
