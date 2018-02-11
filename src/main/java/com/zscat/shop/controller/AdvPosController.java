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

import com.zscat.shop.domain.AdvPosDO;
import com.zscat.shop.service.AdvPosService;
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
@RequestMapping("/shop/advPos")
public class AdvPosController {
	@Autowired
	private AdvPosService advPosService;
	
	@GetMapping()
	@RequiresPermissions("shop:advPos:advPos")
	String AdvPos(){
	    return "shop/advPos/advPos";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:advPos:advPos")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AdvPosDO> advPosList = advPosService.list(query);
		int total = advPosService.count(query);
		PageUtils pageUtils = new PageUtils(advPosList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:advPos:add")
	String add(){
	    return "shop/advPos/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:advPos:edit")
	String edit(@PathVariable("id") Long id,Model model){
		AdvPosDO advPos = advPosService.get(id);
		model.addAttribute("advPos", advPos);
	    return "shop/advPos/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:advPos:add")
	public R save( AdvPosDO advPos){
		if(advPosService.save(advPos)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:advPos:edit")
	public R update( AdvPosDO advPos){
		advPosService.update(advPos);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:advPos:remove")
	public R remove( Long id){
		if(advPosService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:advPos:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		advPosService.batchRemove(ids);
		return R.ok();
	}
	
}
