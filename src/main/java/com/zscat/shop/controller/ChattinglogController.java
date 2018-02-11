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

import com.zscat.shop.domain.ChattinglogDO;
import com.zscat.shop.service.ChattinglogService;
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
@RequestMapping("/shop/chattinglog")
public class ChattinglogController {
	@Autowired
	private ChattinglogService chattinglogService;
	
	@GetMapping()
	@RequiresPermissions("shop:chattinglog:chattinglog")
	String Chattinglog(){
	    return "shop/chattinglog/chattinglog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:chattinglog:chattinglog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ChattinglogDO> chattinglogList = chattinglogService.list(query);
		int total = chattinglogService.count(query);
		PageUtils pageUtils = new PageUtils(chattinglogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:chattinglog:add")
	String add(){
	    return "shop/chattinglog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:chattinglog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ChattinglogDO chattinglog = chattinglogService.get(id);
		model.addAttribute("chattinglog", chattinglog);
	    return "shop/chattinglog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:chattinglog:add")
	public R save( ChattinglogDO chattinglog){
		if(chattinglogService.save(chattinglog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:chattinglog:edit")
	public R update( ChattinglogDO chattinglog){
		chattinglogService.update(chattinglog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:chattinglog:remove")
	public R remove( Long id){
		if(chattinglogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:chattinglog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		chattinglogService.batchRemove(ids);
		return R.ok();
	}
	
}
