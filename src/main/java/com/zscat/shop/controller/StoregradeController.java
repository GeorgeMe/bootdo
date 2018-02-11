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

import com.zscat.shop.domain.StoregradeDO;
import com.zscat.shop.service.StoregradeService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
 
@Controller
@RequestMapping("/shop/storegrade")
public class StoregradeController {
	@Autowired
	private StoregradeService storegradeService;
	
	@GetMapping()
	@RequiresPermissions("shop:storegrade:storegrade")
	String Storegrade(){
	    return "shop/storegrade/storegrade";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storegrade:storegrade")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StoregradeDO> storegradeList = storegradeService.list(query);
		int total = storegradeService.count(query);
		PageUtils pageUtils = new PageUtils(storegradeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storegrade:add")
	String add(){
	    return "shop/storegrade/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storegrade:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StoregradeDO storegrade = storegradeService.get(id);
		model.addAttribute("storegrade", storegrade);
	    return "shop/storegrade/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storegrade:add")
	public R save( StoregradeDO storegrade){
		if(storegradeService.save(storegrade)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storegrade:edit")
	public R update( StoregradeDO storegrade){
		storegradeService.update(storegrade);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storegrade:remove")
	public R remove( Long id){
		if(storegradeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storegrade:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storegradeService.batchRemove(ids);
		return R.ok();
	}
	
}
