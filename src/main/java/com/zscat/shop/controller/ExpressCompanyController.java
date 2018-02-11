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

import com.zscat.shop.domain.ExpressCompanyDO;
import com.zscat.shop.service.ExpressCompanyService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
 
@Controller
@RequestMapping("/shop/expressCompany")
public class ExpressCompanyController {
	@Autowired
	private ExpressCompanyService expressCompanyService;
	
	@GetMapping()
	@RequiresPermissions("shop:expressCompany:expressCompany")
	String ExpressCompany(){
	    return "shop/expressCompany/expressCompany";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:expressCompany:expressCompany")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ExpressCompanyDO> expressCompanyList = expressCompanyService.list(query);
		int total = expressCompanyService.count(query);
		PageUtils pageUtils = new PageUtils(expressCompanyList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:expressCompany:add")
	String add(){
	    return "shop/expressCompany/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:expressCompany:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ExpressCompanyDO expressCompany = expressCompanyService.get(id);
		model.addAttribute("expressCompany", expressCompany);
	    return "shop/expressCompany/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:expressCompany:add")
	public R save( ExpressCompanyDO expressCompany){
		if(expressCompanyService.save(expressCompany)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:expressCompany:edit")
	public R update( ExpressCompanyDO expressCompany){
		expressCompanyService.update(expressCompany);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:expressCompany:remove")
	public R remove( Long id){
		if(expressCompanyService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:expressCompany:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		expressCompanyService.batchRemove(ids);
		return R.ok();
	}
	
}
