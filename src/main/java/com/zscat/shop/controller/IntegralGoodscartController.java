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

import com.zscat.shop.domain.IntegralGoodscartDO;
import com.zscat.shop.service.IntegralGoodscartService;
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
@RequestMapping("/shop/integralGoodscart")
public class IntegralGoodscartController {
	@Autowired
	private IntegralGoodscartService integralGoodscartService;
	
	@GetMapping()
	@RequiresPermissions("shop:integralGoodscart:integralGoodscart")
	String IntegralGoodscart(){
	    return "shop/integralGoodscart/integralGoodscart";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:integralGoodscart:integralGoodscart")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IntegralGoodscartDO> integralGoodscartList = integralGoodscartService.list(query);
		int total = integralGoodscartService.count(query);
		PageUtils pageUtils = new PageUtils(integralGoodscartList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:integralGoodscart:add")
	String add(){
	    return "shop/integralGoodscart/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:integralGoodscart:edit")
	String edit(@PathVariable("id") Long id,Model model){
		IntegralGoodscartDO integralGoodscart = integralGoodscartService.get(id);
		model.addAttribute("integralGoodscart", integralGoodscart);
	    return "shop/integralGoodscart/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:integralGoodscart:add")
	public R save( IntegralGoodscartDO integralGoodscart){
		if(integralGoodscartService.save(integralGoodscart)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:integralGoodscart:edit")
	public R update( IntegralGoodscartDO integralGoodscart){
		integralGoodscartService.update(integralGoodscart);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:integralGoodscart:remove")
	public R remove( Long id){
		if(integralGoodscartService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:integralGoodscart:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		integralGoodscartService.batchRemove(ids);
		return R.ok();
	}
	
}
