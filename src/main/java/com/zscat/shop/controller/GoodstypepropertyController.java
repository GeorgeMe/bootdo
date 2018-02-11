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

import com.zscat.shop.domain.GoodstypepropertyDO;
import com.zscat.shop.service.GoodstypepropertyService;
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
@RequestMapping("/shop/goodstypeproperty")
public class GoodstypepropertyController {
	@Autowired
	private GoodstypepropertyService goodstypepropertyService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodstypeproperty:goodstypeproperty")
	String Goodstypeproperty(){
	    return "shop/goodstypeproperty/goodstypeproperty";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodstypeproperty:goodstypeproperty")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodstypepropertyDO> goodstypepropertyList = goodstypepropertyService.list(query);
		int total = goodstypepropertyService.count(query);
		PageUtils pageUtils = new PageUtils(goodstypepropertyList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodstypeproperty:add")
	String add(){
	    return "shop/goodstypeproperty/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodstypeproperty:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodstypepropertyDO goodstypeproperty = goodstypepropertyService.get(id);
		model.addAttribute("goodstypeproperty", goodstypeproperty);
	    return "shop/goodstypeproperty/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodstypeproperty:add")
	public R save( GoodstypepropertyDO goodstypeproperty){
		if(goodstypepropertyService.save(goodstypeproperty)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodstypeproperty:edit")
	public R update( GoodstypepropertyDO goodstypeproperty){
		goodstypepropertyService.update(goodstypeproperty);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodstypeproperty:remove")
	public R remove( Long id){
		if(goodstypepropertyService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodstypeproperty:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodstypepropertyService.batchRemove(ids);
		return R.ok();
	}
	
}
