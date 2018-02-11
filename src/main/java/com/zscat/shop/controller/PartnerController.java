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

import com.zscat.shop.domain.PartnerDO;
import com.zscat.shop.service.PartnerService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
 
@Controller
@RequestMapping("/shop/partner")
public class PartnerController {
	@Autowired
	private PartnerService partnerService;
	
	@GetMapping()
	@RequiresPermissions("shop:partner:partner")
	String Partner(){
	    return "shop/partner/partner";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:partner:partner")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PartnerDO> partnerList = partnerService.list(query);
		int total = partnerService.count(query);
		PageUtils pageUtils = new PageUtils(partnerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:partner:add")
	String add(){
	    return "shop/partner/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:partner:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PartnerDO partner = partnerService.get(id);
		model.addAttribute("partner", partner);
	    return "shop/partner/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:partner:add")
	public R save( PartnerDO partner){
		if(partnerService.save(partner)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:partner:edit")
	public R update( PartnerDO partner){
		partnerService.update(partner);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:partner:remove")
	public R remove( Long id){
		if(partnerService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:partner:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		partnerService.batchRemove(ids);
		return R.ok();
	}
	
}
