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

import com.zscat.shop.domain.UserAttentionDO;
import com.zscat.shop.service.UserAttentionService;
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
@RequestMapping("/shop/userAttention")
public class UserAttentionController {
	@Autowired
	private UserAttentionService userAttentionService;
	
	@GetMapping()
	@RequiresPermissions("shop:userAttention:userAttention")
	String UserAttention(){
	    return "shop/userAttention/userAttention";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:userAttention:userAttention")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UserAttentionDO> userAttentionList = userAttentionService.list(query);
		int total = userAttentionService.count(query);
		PageUtils pageUtils = new PageUtils(userAttentionList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:userAttention:add")
	String add(){
	    return "shop/userAttention/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:userAttention:edit")
	String edit(@PathVariable("id") Long id,Model model){
		UserAttentionDO userAttention = userAttentionService.get(id);
		model.addAttribute("userAttention", userAttention);
	    return "shop/userAttention/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:userAttention:add")
	public R save( UserAttentionDO userAttention){
		if(userAttentionService.save(userAttention)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:userAttention:edit")
	public R update( UserAttentionDO userAttention){
		userAttentionService.update(userAttention);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:userAttention:remove")
	public R remove( Long id){
		if(userAttentionService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:userAttention:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		userAttentionService.batchRemove(ids);
		return R.ok();
	}
	
}
