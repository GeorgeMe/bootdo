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

import com.zscat.shop.domain.MobileverifycodeDO;
import com.zscat.shop.service.MobileverifycodeService;
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
@RequestMapping("/shop/mobileverifycode")
public class MobileverifycodeController {
	@Autowired
	private MobileverifycodeService mobileverifycodeService;
	
	@GetMapping()
	@RequiresPermissions("shop:mobileverifycode:mobileverifycode")
	String Mobileverifycode(){
	    return "shop/mobileverifycode/mobileverifycode";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:mobileverifycode:mobileverifycode")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MobileverifycodeDO> mobileverifycodeList = mobileverifycodeService.list(query);
		int total = mobileverifycodeService.count(query);
		PageUtils pageUtils = new PageUtils(mobileverifycodeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:mobileverifycode:add")
	String add(){
	    return "shop/mobileverifycode/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:mobileverifycode:edit")
	String edit(@PathVariable("id") Long id,Model model){
		MobileverifycodeDO mobileverifycode = mobileverifycodeService.get(id);
		model.addAttribute("mobileverifycode", mobileverifycode);
	    return "shop/mobileverifycode/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:mobileverifycode:add")
	public R save( MobileverifycodeDO mobileverifycode){
		if(mobileverifycodeService.save(mobileverifycode)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:mobileverifycode:edit")
	public R update( MobileverifycodeDO mobileverifycode){
		mobileverifycodeService.update(mobileverifycode);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:mobileverifycode:remove")
	public R remove( Long id){
		if(mobileverifycodeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:mobileverifycode:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		mobileverifycodeService.batchRemove(ids);
		return R.ok();
	}
	
}
