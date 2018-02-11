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

import com.zscat.shop.domain.GoodsFloorDO;
import com.zscat.shop.service.GoodsFloorService;
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
@RequestMapping("/shop/goodsFloor")
public class GoodsFloorController {
	@Autowired
	private GoodsFloorService goodsFloorService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsFloor:goodsFloor")
	String GoodsFloor(){
	    return "shop/goodsFloor/goodsFloor";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsFloor:goodsFloor")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsFloorDO> goodsFloorList = goodsFloorService.list(query);
		int total = goodsFloorService.count(query);
		PageUtils pageUtils = new PageUtils(goodsFloorList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsFloor:add")
	String add(){
	    return "shop/goodsFloor/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsFloor:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsFloorDO goodsFloor = goodsFloorService.get(id);
		model.addAttribute("goodsFloor", goodsFloor);
	    return "shop/goodsFloor/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsFloor:add")
	public R save( GoodsFloorDO goodsFloor){
		if(goodsFloorService.save(goodsFloor)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsFloor:edit")
	public R update( GoodsFloorDO goodsFloor){
		goodsFloorService.update(goodsFloor);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsFloor:remove")
	public R remove( Long id){
		if(goodsFloorService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsFloor:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsFloorService.batchRemove(ids);
		return R.ok();
	}
	
}
