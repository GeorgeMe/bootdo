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

import com.zscat.shop.domain.HomepageGoodsclassLogDO;
import com.zscat.shop.service.HomepageGoodsclassLogService;
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
@RequestMapping("/shop/homepageGoodsclassLog")
public class HomepageGoodsclassLogController {
	@Autowired
	private HomepageGoodsclassLogService homepageGoodsclassLogService;
	
	@GetMapping()
	@RequiresPermissions("shop:homepageGoodsclassLog:homepageGoodsclassLog")
	String HomepageGoodsclassLog(){
	    return "shop/homepageGoodsclassLog/homepageGoodsclassLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:homepageGoodsclassLog:homepageGoodsclassLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HomepageGoodsclassLogDO> homepageGoodsclassLogList = homepageGoodsclassLogService.list(query);
		int total = homepageGoodsclassLogService.count(query);
		PageUtils pageUtils = new PageUtils(homepageGoodsclassLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:homepageGoodsclassLog:add")
	String add(){
	    return "shop/homepageGoodsclassLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:homepageGoodsclassLog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		HomepageGoodsclassLogDO homepageGoodsclassLog = homepageGoodsclassLogService.get(id);
		model.addAttribute("homepageGoodsclassLog", homepageGoodsclassLog);
	    return "shop/homepageGoodsclassLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:homepageGoodsclassLog:add")
	public R save( HomepageGoodsclassLogDO homepageGoodsclassLog){
		if(homepageGoodsclassLogService.save(homepageGoodsclassLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:homepageGoodsclassLog:edit")
	public R update( HomepageGoodsclassLogDO homepageGoodsclassLog){
		homepageGoodsclassLogService.update(homepageGoodsclassLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:homepageGoodsclassLog:remove")
	public R remove( Long id){
		if(homepageGoodsclassLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:homepageGoodsclassLog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		homepageGoodsclassLogService.batchRemove(ids);
		return R.ok();
	}
	
}
