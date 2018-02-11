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

import com.zscat.shop.domain.GoodsbrandDO;
import com.zscat.shop.service.GoodsbrandService;
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
@RequestMapping("/shop/goodsbrand")
public class GoodsbrandController {
	@Autowired
	private GoodsbrandService goodsbrandService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsbrand:goodsbrand")
	String Goodsbrand(){
	    return "shop/goodsbrand/goodsbrand";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsbrand:goodsbrand")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsbrandDO> goodsbrandList = goodsbrandService.list(query);
		int total = goodsbrandService.count(query);
		PageUtils pageUtils = new PageUtils(goodsbrandList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsbrand:add")
	String add(){
	    return "shop/goodsbrand/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsbrand:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsbrandDO goodsbrand = goodsbrandService.get(id);
		model.addAttribute("goodsbrand", goodsbrand);
	    return "shop/goodsbrand/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsbrand:add")
	public R save( GoodsbrandDO goodsbrand){
		if(goodsbrandService.save(goodsbrand)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsbrand:edit")
	public R update( GoodsbrandDO goodsbrand){
		goodsbrandService.update(goodsbrand);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsbrand:remove")
	public R remove( Long id){
		if(goodsbrandService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsbrand:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsbrandService.batchRemove(ids);
		return R.ok();
	}
	
}
