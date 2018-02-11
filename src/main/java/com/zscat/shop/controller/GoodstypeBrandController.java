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

import com.zscat.shop.domain.GoodstypeBrandDO;
import com.zscat.shop.service.GoodstypeBrandService;
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
@RequestMapping("/shop/goodstypeBrand")
public class GoodstypeBrandController {
	@Autowired
	private GoodstypeBrandService goodstypeBrandService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodstypeBrand:goodstypeBrand")
	String GoodstypeBrand(){
	    return "shop/goodstypeBrand/goodstypeBrand";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodstypeBrand:goodstypeBrand")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodstypeBrandDO> goodstypeBrandList = goodstypeBrandService.list(query);
		int total = goodstypeBrandService.count(query);
		PageUtils pageUtils = new PageUtils(goodstypeBrandList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodstypeBrand:add")
	String add(){
	    return "shop/goodstypeBrand/add";
	}

	@GetMapping("/edit/{typeId}")
	@RequiresPermissions("shop:goodstypeBrand:edit")
	String edit(@PathVariable("typeId") Long typeId,Model model){
		GoodstypeBrandDO goodstypeBrand = goodstypeBrandService.get(typeId);
		model.addAttribute("goodstypeBrand", goodstypeBrand);
	    return "shop/goodstypeBrand/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodstypeBrand:add")
	public R save( GoodstypeBrandDO goodstypeBrand){
		if(goodstypeBrandService.save(goodstypeBrand)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodstypeBrand:edit")
	public R update( GoodstypeBrandDO goodstypeBrand){
		goodstypeBrandService.update(goodstypeBrand);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodstypeBrand:remove")
	public R remove( Long typeId){
		if(goodstypeBrandService.remove(typeId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodstypeBrand:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] typeIds){
		goodstypeBrandService.batchRemove(typeIds);
		return R.ok();
	}
	
}
