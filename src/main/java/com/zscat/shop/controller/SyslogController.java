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

import com.zscat.shop.domain.SyslogDO;
import com.zscat.shop.service.SyslogService;
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
@RequestMapping("/shop/syslog")
public class SyslogController {
	@Autowired
	private SyslogService syslogService;
	
	@GetMapping()
	@RequiresPermissions("shop:syslog:syslog")
	String Syslog(){
	    return "shop/syslog/syslog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:syslog:syslog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SyslogDO> syslogList = syslogService.list(query);
		int total = syslogService.count(query);
		PageUtils pageUtils = new PageUtils(syslogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:syslog:add")
	String add(){
	    return "shop/syslog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:syslog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		SyslogDO syslog = syslogService.get(id);
		model.addAttribute("syslog", syslog);
	    return "shop/syslog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:syslog:add")
	public R save( SyslogDO syslog){
		if(syslogService.save(syslog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:syslog:edit")
	public R update( SyslogDO syslog){
		syslogService.update(syslog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:syslog:remove")
	public R remove( Long id){
		if(syslogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:syslog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		syslogService.batchRemove(ids);
		return R.ok();
	}
	
}
