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

import com.zscat.shop.domain.BargainDO;
import com.zscat.shop.service.BargainService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
 
@Controller
@RequestMapping("/shop/bargain")
public class BargainController {
	@Autowired
	private BargainService bargainService;
	
	@GetMapping()
	@RequiresPermissions("shop:bargain:bargain")
	String Bargain(){
	    return "shop/bargain/bargain";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:bargain:bargain")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<BargainDO> bargainList = bargainService.list(query);
		int total = bargainService.count(query);
		PageUtils pageUtils = new PageUtils(bargainList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:bargain:add")
	String add(){
	    return "shop/bargain/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:bargain:edit")
	String edit(@PathVariable("id") Long id,Model model){
		BargainDO bargain = bargainService.get(id);
		model.addAttribute("bargain", bargain);
	    return "shop/bargain/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:bargain:add")
	public R save( BargainDO bargain){
		if(bargainService.save(bargain)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:bargain:edit")
	public R update( BargainDO bargain){
		bargainService.update(bargain);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:bargain:remove")
	public R remove( Long id){
		if(bargainService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:bargain:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		bargainService.batchRemove(ids);
		return R.ok();
	}
	
}
