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

import com.zscat.shop.domain.ComplaintDO;
import com.zscat.shop.service.ComplaintService;
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
@RequestMapping("/shop/complaint")
public class ComplaintController {
	@Autowired
	private ComplaintService complaintService;
	
	@GetMapping()
	@RequiresPermissions("shop:complaint:complaint")
	String Complaint(){
	    return "shop/complaint/complaint";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:complaint:complaint")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ComplaintDO> complaintList = complaintService.list(query);
		int total = complaintService.count(query);
		PageUtils pageUtils = new PageUtils(complaintList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:complaint:add")
	String add(){
	    return "shop/complaint/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:complaint:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ComplaintDO complaint = complaintService.get(id);
		model.addAttribute("complaint", complaint);
	    return "shop/complaint/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:complaint:add")
	public R save( ComplaintDO complaint){
		if(complaintService.save(complaint)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:complaint:edit")
	public R update( ComplaintDO complaint){
		complaintService.update(complaint);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:complaint:remove")
	public R remove( Long id){
		if(complaintService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:complaint:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		complaintService.batchRemove(ids);
		return R.ok();
	}
	
}
