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

import com.zscat.shop.domain.GoldRecordDO;
import com.zscat.shop.service.GoldRecordService;
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
@RequestMapping("/shop/goldRecord")
public class GoldRecordController {
	@Autowired
	private GoldRecordService goldRecordService;
	
	@GetMapping()
	@RequiresPermissions("shop:goldRecord:goldRecord")
	String GoldRecord(){
	    return "shop/goldRecord/goldRecord";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goldRecord:goldRecord")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoldRecordDO> goldRecordList = goldRecordService.list(query);
		int total = goldRecordService.count(query);
		PageUtils pageUtils = new PageUtils(goldRecordList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goldRecord:add")
	String add(){
	    return "shop/goldRecord/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goldRecord:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoldRecordDO goldRecord = goldRecordService.get(id);
		model.addAttribute("goldRecord", goldRecord);
	    return "shop/goldRecord/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goldRecord:add")
	public R save( GoldRecordDO goldRecord){
		if(goldRecordService.save(goldRecord)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goldRecord:edit")
	public R update( GoldRecordDO goldRecord){
		goldRecordService.update(goldRecord);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goldRecord:remove")
	public R remove( Long id){
		if(goldRecordService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goldRecord:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goldRecordService.batchRemove(ids);
		return R.ok();
	}
	
}
