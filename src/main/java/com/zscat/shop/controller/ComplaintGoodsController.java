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

import com.zscat.shop.domain.ComplaintGoodsDO;
import com.zscat.shop.service.ComplaintGoodsService;
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
@RequestMapping("/shop/complaintGoods")
public class ComplaintGoodsController {
	@Autowired
	private ComplaintGoodsService complaintGoodsService;
	
	@GetMapping()
	@RequiresPermissions("shop:complaintGoods:complaintGoods")
	String ComplaintGoods(){
	    return "shop/complaintGoods/complaintGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:complaintGoods:complaintGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ComplaintGoodsDO> complaintGoodsList = complaintGoodsService.list(query);
		int total = complaintGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(complaintGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:complaintGoods:add")
	String add(){
	    return "shop/complaintGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:complaintGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ComplaintGoodsDO complaintGoods = complaintGoodsService.get(id);
		model.addAttribute("complaintGoods", complaintGoods);
	    return "shop/complaintGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:complaintGoods:add")
	public R save( ComplaintGoodsDO complaintGoods){
		if(complaintGoodsService.save(complaintGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:complaintGoods:edit")
	public R update( ComplaintGoodsDO complaintGoods){
		complaintGoodsService.update(complaintGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:complaintGoods:remove")
	public R remove( Long id){
		if(complaintGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:complaintGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		complaintGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
