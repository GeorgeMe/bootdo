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

import com.zscat.shop.domain.ReportTypeDO;
import com.zscat.shop.service.ReportTypeService;
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
@RequestMapping("/shop/reportType")
public class ReportTypeController {
	@Autowired
	private ReportTypeService reportTypeService;
	
	@GetMapping()
	@RequiresPermissions("shop:reportType:reportType")
	String ReportType(){
	    return "shop/reportType/reportType";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:reportType:reportType")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ReportTypeDO> reportTypeList = reportTypeService.list(query);
		int total = reportTypeService.count(query);
		PageUtils pageUtils = new PageUtils(reportTypeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:reportType:add")
	String add(){
	    return "shop/reportType/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:reportType:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ReportTypeDO reportType = reportTypeService.get(id);
		model.addAttribute("reportType", reportType);
	    return "shop/reportType/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:reportType:add")
	public R save( ReportTypeDO reportType){
		if(reportTypeService.save(reportType)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:reportType:edit")
	public R update( ReportTypeDO reportType){
		reportTypeService.update(reportType);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:reportType:remove")
	public R remove( Long id){
		if(reportTypeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:reportType:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		reportTypeService.batchRemove(ids);
		return R.ok();
	}
	
}
