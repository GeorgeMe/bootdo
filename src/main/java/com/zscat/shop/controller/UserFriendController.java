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

import com.zscat.shop.domain.UserFriendDO;
import com.zscat.shop.service.UserFriendService;
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
@RequestMapping("/shop/userFriend")
public class UserFriendController {
	@Autowired
	private UserFriendService userFriendService;
	
	@GetMapping()
	@RequiresPermissions("shop:userFriend:userFriend")
	String UserFriend(){
	    return "shop/userFriend/userFriend";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:userFriend:userFriend")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UserFriendDO> userFriendList = userFriendService.list(query);
		int total = userFriendService.count(query);
		PageUtils pageUtils = new PageUtils(userFriendList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:userFriend:add")
	String add(){
	    return "shop/userFriend/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:userFriend:edit")
	String edit(@PathVariable("id") Long id,Model model){
		UserFriendDO userFriend = userFriendService.get(id);
		model.addAttribute("userFriend", userFriend);
	    return "shop/userFriend/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:userFriend:add")
	public R save( UserFriendDO userFriend){
		if(userFriendService.save(userFriend)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:userFriend:edit")
	public R update( UserFriendDO userFriend){
		userFriendService.update(userFriend);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:userFriend:remove")
	public R remove( Long id){
		if(userFriendService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:userFriend:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		userFriendService.batchRemove(ids);
		return R.ok();
	}
	
}
