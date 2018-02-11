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

import com.zscat.shop.domain.StorePartnerDO;
import com.zscat.shop.service.StorePartnerService;
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
@RequestMapping("/shop/storePartner")
public class StorePartnerController {
	@Autowired
	private StorePartnerService storePartnerService;
	
	@GetMapping()
	@RequiresPermissions("shop:storePartner:storePartner")
	String StorePartner(){
	    return "shop/storePartner/storePartner";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storePartner:storePartner")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StorePartnerDO> storePartnerList = storePartnerService.list(query);
		int total = storePartnerService.count(query);
		PageUtils pageUtils = new PageUtils(storePartnerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storePartner:add")
	String add(){
	    return "shop/storePartner/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storePartner:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StorePartnerDO storePartner = storePartnerService.get(id);
		model.addAttribute("storePartner", storePartner);
	    return "shop/storePartner/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storePartner:add")
	public R save( StorePartnerDO storePartner){
		if(storePartnerService.save(storePartner)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storePartner:edit")
	public R update( StorePartnerDO storePartner){
		storePartnerService.update(storePartner);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storePartner:remove")
	public R remove( Long id){
		if(storePartnerService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storePartner:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storePartnerService.batchRemove(ids);
		return R.ok();
	}
	
}
