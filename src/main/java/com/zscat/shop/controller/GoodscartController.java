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

import com.zscat.shop.domain.GoodscartDO;
import com.zscat.shop.service.GoodscartService;
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
@RequestMapping("/shop/goodscart")
public class GoodscartController {
	@Autowired
	private GoodscartService goodscartService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodscart:goodscart")
	String Goodscart(){
	    return "shop/goodscart/goodscart";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodscart:goodscart")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodscartDO> goodscartList = goodscartService.list(query);
		int total = goodscartService.count(query);
		PageUtils pageUtils = new PageUtils(goodscartList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodscart:add")
	String add(){
	    return "shop/goodscart/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodscart:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodscartDO goodscart = goodscartService.get(id);
		model.addAttribute("goodscart", goodscart);
	    return "shop/goodscart/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodscart:add")
	public R save( GoodscartDO goodscart){
		if(goodscartService.save(goodscart)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodscart:edit")
	public R update( GoodscartDO goodscart){
		goodscartService.update(goodscart);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodscart:remove")
	public R remove( Long id){
		if(goodscartService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodscart:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodscartService.batchRemove(ids);
		return R.ok();
	}
	
}
