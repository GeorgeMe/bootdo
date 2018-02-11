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

import com.zscat.shop.domain.ReportSubjectDO;
import com.zscat.shop.service.ReportSubjectService;
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
@RequestMapping("/shop/reportSubject")
public class ReportSubjectController {
	@Autowired
	private ReportSubjectService reportSubjectService;
	
	@GetMapping()
	@RequiresPermissions("shop:reportSubject:reportSubject")
	String ReportSubject(){
	    return "shop/reportSubject/reportSubject";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:reportSubject:reportSubject")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ReportSubjectDO> reportSubjectList = reportSubjectService.list(query);
		int total = reportSubjectService.count(query);
		PageUtils pageUtils = new PageUtils(reportSubjectList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:reportSubject:add")
	String add(){
	    return "shop/reportSubject/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:reportSubject:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ReportSubjectDO reportSubject = reportSubjectService.get(id);
		model.addAttribute("reportSubject", reportSubject);
	    return "shop/reportSubject/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:reportSubject:add")
	public R save( ReportSubjectDO reportSubject){
		if(reportSubjectService.save(reportSubject)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:reportSubject:edit")
	public R update( ReportSubjectDO reportSubject){
		reportSubjectService.update(reportSubject);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:reportSubject:remove")
	public R remove( Long id){
		if(reportSubjectService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:reportSubject:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		reportSubjectService.batchRemove(ids);
		return R.ok();
	}
	
}
