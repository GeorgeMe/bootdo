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

import com.zscat.shop.domain.AreaDO;
import com.zscat.shop.service.AreaService;
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
@RequestMapping("/shop/area")
public class AreaController {
	@Autowired
	private AreaService areaService;
	
	@GetMapping()
	@RequiresPermissions("shop:area:area")
	String Area(){
	    return "shop/area/area";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:area:area")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AreaDO> areaList = areaService.list(query);
		int total = areaService.count(query);
		PageUtils pageUtils = new PageUtils(areaList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:area:add")
	String add(){
	    return "shop/area/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:area:edit")
	String edit(@PathVariable("id") Long id,Model model){
		AreaDO area = areaService.get(id);
		model.addAttribute("area", area);
	    return "shop/area/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:area:add")
	public R save( AreaDO area){
		if(areaService.save(area)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:area:edit")
	public R update( AreaDO area){
		areaService.update(area);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:area:remove")
	public R remove( Long id){
		if(areaService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:area:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		areaService.batchRemove(ids);
		return R.ok();
	}
	
}
