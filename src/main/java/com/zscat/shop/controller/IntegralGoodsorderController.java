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

import com.zscat.shop.domain.IntegralGoodsorderDO;
import com.zscat.shop.service.IntegralGoodsorderService;
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
@RequestMapping("/shop/integralGoodsorder")
public class IntegralGoodsorderController {
	@Autowired
	private IntegralGoodsorderService integralGoodsorderService;
	
	@GetMapping()
	@RequiresPermissions("shop:integralGoodsorder:integralGoodsorder")
	String IntegralGoodsorder(){
	    return "shop/integralGoodsorder/integralGoodsorder";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:integralGoodsorder:integralGoodsorder")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IntegralGoodsorderDO> integralGoodsorderList = integralGoodsorderService.list(query);
		int total = integralGoodsorderService.count(query);
		PageUtils pageUtils = new PageUtils(integralGoodsorderList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:integralGoodsorder:add")
	String add(){
	    return "shop/integralGoodsorder/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:integralGoodsorder:edit")
	String edit(@PathVariable("id") Long id,Model model){
		IntegralGoodsorderDO integralGoodsorder = integralGoodsorderService.get(id);
		model.addAttribute("integralGoodsorder", integralGoodsorder);
	    return "shop/integralGoodsorder/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:integralGoodsorder:add")
	public R save( IntegralGoodsorderDO integralGoodsorder){
		if(integralGoodsorderService.save(integralGoodsorder)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:integralGoodsorder:edit")
	public R update( IntegralGoodsorderDO integralGoodsorder){
		integralGoodsorderService.update(integralGoodsorder);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:integralGoodsorder:remove")
	public R remove( Long id){
		if(integralGoodsorderService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:integralGoodsorder:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		integralGoodsorderService.batchRemove(ids);
		return R.ok();
	}
	
}
