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

import com.zscat.shop.domain.GoodstypeSpecDO;
import com.zscat.shop.service.GoodstypeSpecService;
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
@RequestMapping("/shop/goodstypeSpec")
public class GoodstypeSpecController {
	@Autowired
	private GoodstypeSpecService goodstypeSpecService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodstypeSpec:goodstypeSpec")
	String GoodstypeSpec(){
	    return "shop/goodstypeSpec/goodstypeSpec";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodstypeSpec:goodstypeSpec")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodstypeSpecDO> goodstypeSpecList = goodstypeSpecService.list(query);
		int total = goodstypeSpecService.count(query);
		PageUtils pageUtils = new PageUtils(goodstypeSpecList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodstypeSpec:add")
	String add(){
	    return "shop/goodstypeSpec/add";
	}

	@GetMapping("/edit/{typeId}")
	@RequiresPermissions("shop:goodstypeSpec:edit")
	String edit(@PathVariable("typeId") Long typeId,Model model){
		GoodstypeSpecDO goodstypeSpec = goodstypeSpecService.get(typeId);
		model.addAttribute("goodstypeSpec", goodstypeSpec);
	    return "shop/goodstypeSpec/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodstypeSpec:add")
	public R save( GoodstypeSpecDO goodstypeSpec){
		if(goodstypeSpecService.save(goodstypeSpec)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodstypeSpec:edit")
	public R update( GoodstypeSpecDO goodstypeSpec){
		goodstypeSpecService.update(goodstypeSpec);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodstypeSpec:remove")
	public R remove( Long typeId){
		if(goodstypeSpecService.remove(typeId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodstypeSpec:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] typeIds){
		goodstypeSpecService.batchRemove(typeIds);
		return R.ok();
	}
	
}
