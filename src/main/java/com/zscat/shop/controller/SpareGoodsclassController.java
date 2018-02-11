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

import com.zscat.shop.domain.SpareGoodsclassDO;
import com.zscat.shop.service.SpareGoodsclassService;
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
@RequestMapping("/shop/spareGoodsclass")
public class SpareGoodsclassController {
	@Autowired
	private SpareGoodsclassService spareGoodsclassService;
	
	@GetMapping()
	@RequiresPermissions("shop:spareGoodsclass:spareGoodsclass")
	String SpareGoodsclass(){
	    return "shop/spareGoodsclass/spareGoodsclass";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:spareGoodsclass:spareGoodsclass")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SpareGoodsclassDO> spareGoodsclassList = spareGoodsclassService.list(query);
		int total = spareGoodsclassService.count(query);
		PageUtils pageUtils = new PageUtils(spareGoodsclassList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:spareGoodsclass:add")
	String add(){
	    return "shop/spareGoodsclass/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:spareGoodsclass:edit")
	String edit(@PathVariable("id") Long id,Model model){
		SpareGoodsclassDO spareGoodsclass = spareGoodsclassService.get(id);
		model.addAttribute("spareGoodsclass", spareGoodsclass);
	    return "shop/spareGoodsclass/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:spareGoodsclass:add")
	public R save( SpareGoodsclassDO spareGoodsclass){
		if(spareGoodsclassService.save(spareGoodsclass)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:spareGoodsclass:edit")
	public R update( SpareGoodsclassDO spareGoodsclass){
		spareGoodsclassService.update(spareGoodsclass);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:spareGoodsclass:remove")
	public R remove( Long id){
		if(spareGoodsclassService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:spareGoodsclass:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		spareGoodsclassService.batchRemove(ids);
		return R.ok();
	}
	
}
