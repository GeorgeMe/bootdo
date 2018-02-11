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

import com.zscat.shop.domain.ChattingDO;
import com.zscat.shop.service.ChattingService;
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
@RequestMapping("/shop/chatting")
public class ChattingController {
	@Autowired
	private ChattingService chattingService;
	
	@GetMapping()
	@RequiresPermissions("shop:chatting:chatting")
	String Chatting(){
	    return "shop/chatting/chatting";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:chatting:chatting")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ChattingDO> chattingList = chattingService.list(query);
		int total = chattingService.count(query);
		PageUtils pageUtils = new PageUtils(chattingList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:chatting:add")
	String add(){
	    return "shop/chatting/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:chatting:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ChattingDO chatting = chattingService.get(id);
		model.addAttribute("chatting", chatting);
	    return "shop/chatting/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:chatting:add")
	public R save( ChattingDO chatting){
		if(chattingService.save(chatting)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:chatting:edit")
	public R update( ChattingDO chatting){
		chattingService.update(chatting);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:chatting:remove")
	public R remove( Long id){
		if(chattingService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:chatting:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		chattingService.batchRemove(ids);
		return R.ok();
	}
	
}
