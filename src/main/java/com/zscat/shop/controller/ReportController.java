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

import com.zscat.shop.domain.ReportDO;
import com.zscat.shop.service.ReportService;
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
@RequestMapping("/shop/report")
public class ReportController {
	@Autowired
	private ReportService reportService;
	
	@GetMapping()
	@RequiresPermissions("shop:report:report")
	String Report(){
	    return "shop/report/report";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:report:report")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ReportDO> reportList = reportService.list(query);
		int total = reportService.count(query);
		PageUtils pageUtils = new PageUtils(reportList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:report:add")
	String add(){
	    return "shop/report/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:report:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ReportDO report = reportService.get(id);
		model.addAttribute("report", report);
	    return "shop/report/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:report:add")
	public R save( ReportDO report){
		if(reportService.save(report)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:report:edit")
	public R update( ReportDO report){
		reportService.update(report);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:report:remove")
	public R remove( Long id){
		if(reportService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:report:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		reportService.batchRemove(ids);
		return R.ok();
	}
	
}
