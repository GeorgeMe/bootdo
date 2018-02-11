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

import com.zscat.shop.domain.GroupGoodsDO;
import com.zscat.shop.service.GroupGoodsService;
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
@RequestMapping("/shop/groupGoods")
public class GroupGoodsController {
	@Autowired
	private GroupGoodsService groupGoodsService;
	
	@GetMapping()
	@RequiresPermissions("shop:groupGoods:groupGoods")
	String GroupGoods(){
	    return "shop/groupGoods/groupGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:groupGoods:groupGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GroupGoodsDO> groupGoodsList = groupGoodsService.list(query);
		int total = groupGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(groupGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:groupGoods:add")
	String add(){
	    return "shop/groupGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:groupGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GroupGoodsDO groupGoods = groupGoodsService.get(id);
		model.addAttribute("groupGoods", groupGoods);
	    return "shop/groupGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:groupGoods:add")
	public R save( GroupGoodsDO groupGoods){
		if(groupGoodsService.save(groupGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:groupGoods:edit")
	public R update( GroupGoodsDO groupGoods){
		groupGoodsService.update(groupGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:groupGoods:remove")
	public R remove( Long id){
		if(groupGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:groupGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		groupGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
