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

import com.zscat.shop.domain.EvaluateDO;
import com.zscat.shop.service.EvaluateService;
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
@RequestMapping("/shop/evaluate")
public class EvaluateController {
	@Autowired
	private EvaluateService evaluateService;
	
	@GetMapping()
	@RequiresPermissions("shop:evaluate:evaluate")
	String Evaluate(){
	    return "shop/evaluate/evaluate";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:evaluate:evaluate")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<EvaluateDO> evaluateList = evaluateService.list(query);
		int total = evaluateService.count(query);
		PageUtils pageUtils = new PageUtils(evaluateList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:evaluate:add")
	String add(){
	    return "shop/evaluate/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:evaluate:edit")
	String edit(@PathVariable("id") Long id,Model model){
		EvaluateDO evaluate = evaluateService.get(id);
		model.addAttribute("evaluate", evaluate);
	    return "shop/evaluate/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:evaluate:add")
	public R save( EvaluateDO evaluate){
		if(evaluateService.save(evaluate)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:evaluate:edit")
	public R update( EvaluateDO evaluate){
		evaluateService.update(evaluate);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:evaluate:remove")
	public R remove( Long id){
		if(evaluateService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:evaluate:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		evaluateService.batchRemove(ids);
		return R.ok();
	}
	
}
