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

import com.zscat.shop.domain.VlogDO;
import com.zscat.shop.service.VlogService;
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
@RequestMapping("/shop/vlog")
public class VlogController {
	@Autowired
	private VlogService vlogService;
	
	@GetMapping()
	@RequiresPermissions("shop:vlog:vlog")
	String Vlog(){
	    return "shop/vlog/vlog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:vlog:vlog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<VlogDO> vlogList = vlogService.list(query);
		int total = vlogService.count(query);
		PageUtils pageUtils = new PageUtils(vlogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:vlog:add")
	String add(){
	    return "shop/vlog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:vlog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		VlogDO vlog = vlogService.get(id);
		model.addAttribute("vlog", vlog);
	    return "shop/vlog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:vlog:add")
	public R save( VlogDO vlog){
		if(vlogService.save(vlog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:vlog:edit")
	public R update( VlogDO vlog){
		vlogService.update(vlog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:vlog:remove")
	public R remove( Long id){
		if(vlogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:vlog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		vlogService.batchRemove(ids);
		return R.ok();
	}
	
}
