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

import com.zscat.shop.domain.VisitDO;
import com.zscat.shop.service.VisitService;
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
@RequestMapping("/shop/visit")
public class VisitController {
	@Autowired
	private VisitService visitService;
	
	@GetMapping()
	@RequiresPermissions("shop:visit:visit")
	String Visit(){
	    return "shop/visit/visit";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:visit:visit")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<VisitDO> visitList = visitService.list(query);
		int total = visitService.count(query);
		PageUtils pageUtils = new PageUtils(visitList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:visit:add")
	String add(){
	    return "shop/visit/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:visit:edit")
	String edit(@PathVariable("id") Long id,Model model){
		VisitDO visit = visitService.get(id);
		model.addAttribute("visit", visit);
	    return "shop/visit/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:visit:add")
	public R save( VisitDO visit){
		if(visitService.save(visit)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:visit:edit")
	public R update( VisitDO visit){
		visitService.update(visit);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:visit:remove")
	public R remove( Long id){
		if(visitService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:visit:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		visitService.batchRemove(ids);
		return R.ok();
	}
	
}
