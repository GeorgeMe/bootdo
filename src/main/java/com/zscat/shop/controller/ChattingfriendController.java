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

import com.zscat.shop.domain.ChattingfriendDO;
import com.zscat.shop.service.ChattingfriendService;
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
@RequestMapping("/shop/chattingfriend")
public class ChattingfriendController {
	@Autowired
	private ChattingfriendService chattingfriendService;
	
	@GetMapping()
	@RequiresPermissions("shop:chattingfriend:chattingfriend")
	String Chattingfriend(){
	    return "shop/chattingfriend/chattingfriend";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:chattingfriend:chattingfriend")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ChattingfriendDO> chattingfriendList = chattingfriendService.list(query);
		int total = chattingfriendService.count(query);
		PageUtils pageUtils = new PageUtils(chattingfriendList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:chattingfriend:add")
	String add(){
	    return "shop/chattingfriend/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:chattingfriend:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ChattingfriendDO chattingfriend = chattingfriendService.get(id);
		model.addAttribute("chattingfriend", chattingfriend);
	    return "shop/chattingfriend/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:chattingfriend:add")
	public R save( ChattingfriendDO chattingfriend){
		if(chattingfriendService.save(chattingfriend)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:chattingfriend:edit")
	public R update( ChattingfriendDO chattingfriend){
		chattingfriendService.update(chattingfriend);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:chattingfriend:remove")
	public R remove( Long id){
		if(chattingfriendService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:chattingfriend:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		chattingfriendService.batchRemove(ids);
		return R.ok();
	}
	
}
