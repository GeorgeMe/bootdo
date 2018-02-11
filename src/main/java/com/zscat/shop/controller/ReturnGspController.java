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

import com.zscat.shop.domain.ReturnGspDO;
import com.zscat.shop.service.ReturnGspService;
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
@RequestMapping("/shop/returnGsp")
public class ReturnGspController {
	@Autowired
	private ReturnGspService returnGspService;
	
	@GetMapping()
	@RequiresPermissions("shop:returnGsp:returnGsp")
	String ReturnGsp(){
	    return "shop/returnGsp/returnGsp";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:returnGsp:returnGsp")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ReturnGspDO> returnGspList = returnGspService.list(query);
		int total = returnGspService.count(query);
		PageUtils pageUtils = new PageUtils(returnGspList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:returnGsp:add")
	String add(){
	    return "shop/returnGsp/add";
	}

	@GetMapping("/edit/{itemId}")
	@RequiresPermissions("shop:returnGsp:edit")
	String edit(@PathVariable("itemId") Long itemId,Model model){
		ReturnGspDO returnGsp = returnGspService.get(itemId);
		model.addAttribute("returnGsp", returnGsp);
	    return "shop/returnGsp/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:returnGsp:add")
	public R save( ReturnGspDO returnGsp){
		if(returnGspService.save(returnGsp)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:returnGsp:edit")
	public R update( ReturnGspDO returnGsp){
		returnGspService.update(returnGsp);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:returnGsp:remove")
	public R remove( Long itemId){
		if(returnGspService.remove(itemId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:returnGsp:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] itemIds){
		returnGspService.batchRemove(itemIds);
		return R.ok();
	}
	
}
