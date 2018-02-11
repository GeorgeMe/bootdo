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

import com.zscat.shop.domain.MessageDO;
import com.zscat.shop.service.MessageService;
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
@RequestMapping("/shop/message")
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@GetMapping()
	@RequiresPermissions("shop:message:message")
	String Message(){
	    return "shop/message/message";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:message:message")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MessageDO> messageList = messageService.list(query);
		int total = messageService.count(query);
		PageUtils pageUtils = new PageUtils(messageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:message:add")
	String add(){
	    return "shop/message/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:message:edit")
	String edit(@PathVariable("id") Long id,Model model){
		MessageDO message = messageService.get(id);
		model.addAttribute("message", message);
	    return "shop/message/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:message:add")
	public R save( MessageDO message){
		if(messageService.save(message)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:message:edit")
	public R update( MessageDO message){
		messageService.update(message);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:message:remove")
	public R remove( Long id){
		if(messageService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:message:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		messageService.batchRemove(ids);
		return R.ok();
	}
	
}
