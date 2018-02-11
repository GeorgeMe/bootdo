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

import com.zscat.shop.domain.StoreclassDO;
import com.zscat.shop.service.StoreclassService;
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
@RequestMapping("/shop/storeclass")
public class StoreclassController {
	@Autowired
	private StoreclassService storeclassService;
	
	@GetMapping()
	@RequiresPermissions("shop:storeclass:storeclass")
	String Storeclass(){
	    return "shop/storeclass/storeclass";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:storeclass:storeclass")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StoreclassDO> storeclassList = storeclassService.list(query);
		int total = storeclassService.count(query);
		PageUtils pageUtils = new PageUtils(storeclassList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:storeclass:add")
	String add(){
	    return "shop/storeclass/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:storeclass:edit")
	String edit(@PathVariable("id") Long id,Model model){
		StoreclassDO storeclass = storeclassService.get(id);
		model.addAttribute("storeclass", storeclass);
	    return "shop/storeclass/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:storeclass:add")
	public R save( StoreclassDO storeclass){
		if(storeclassService.save(storeclass)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:storeclass:edit")
	public R update( StoreclassDO storeclass){
		storeclassService.update(storeclass);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:storeclass:remove")
	public R remove( Long id){
		if(storeclassService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:storeclass:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		storeclassService.batchRemove(ids);
		return R.ok();
	}
	
}
