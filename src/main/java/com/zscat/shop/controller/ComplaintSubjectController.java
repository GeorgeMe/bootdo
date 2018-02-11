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

import com.zscat.shop.domain.ComplaintSubjectDO;
import com.zscat.shop.service.ComplaintSubjectService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
 
@Controller
@RequestMapping("/shop/complaintSubject")
public class ComplaintSubjectController {
	@Autowired
	private ComplaintSubjectService complaintSubjectService;
	
	@GetMapping()
	@RequiresPermissions("shop:complaintSubject:complaintSubject")
	String ComplaintSubject(){
	    return "shop/complaintSubject/complaintSubject";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:complaintSubject:complaintSubject")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ComplaintSubjectDO> complaintSubjectList = complaintSubjectService.list(query);
		int total = complaintSubjectService.count(query);
		PageUtils pageUtils = new PageUtils(complaintSubjectList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:complaintSubject:add")
	String add(){
	    return "shop/complaintSubject/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:complaintSubject:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ComplaintSubjectDO complaintSubject = complaintSubjectService.get(id);
		model.addAttribute("complaintSubject", complaintSubject);
	    return "shop/complaintSubject/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:complaintSubject:add")
	public R save( ComplaintSubjectDO complaintSubject){
		if(complaintSubjectService.save(complaintSubject)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:complaintSubject:edit")
	public R update( ComplaintSubjectDO complaintSubject){
		complaintSubjectService.update(complaintSubject);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:complaintSubject:remove")
	public R remove( Long id){
		if(complaintSubjectService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:complaintSubject:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		complaintSubjectService.batchRemove(ids);
		return R.ok();
	}
	
}
