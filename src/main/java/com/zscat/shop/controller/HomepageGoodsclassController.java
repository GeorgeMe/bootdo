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

import com.zscat.shop.domain.HomepageGoodsclassDO;
import com.zscat.shop.service.HomepageGoodsclassService;
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
@RequestMapping("/shop/homepageGoodsclass")
public class HomepageGoodsclassController {
	@Autowired
	private HomepageGoodsclassService homepageGoodsclassService;
	
	@GetMapping()
	@RequiresPermissions("shop:homepageGoodsclass:homepageGoodsclass")
	String HomepageGoodsclass(){
	    return "shop/homepageGoodsclass/homepageGoodsclass";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:homepageGoodsclass:homepageGoodsclass")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HomepageGoodsclassDO> homepageGoodsclassList = homepageGoodsclassService.list(query);
		int total = homepageGoodsclassService.count(query);
		PageUtils pageUtils = new PageUtils(homepageGoodsclassList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:homepageGoodsclass:add")
	String add(){
	    return "shop/homepageGoodsclass/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:homepageGoodsclass:edit")
	String edit(@PathVariable("id") Long id,Model model){
		HomepageGoodsclassDO homepageGoodsclass = homepageGoodsclassService.get(id);
		model.addAttribute("homepageGoodsclass", homepageGoodsclass);
	    return "shop/homepageGoodsclass/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:homepageGoodsclass:add")
	public R save( HomepageGoodsclassDO homepageGoodsclass){
		if(homepageGoodsclassService.save(homepageGoodsclass)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:homepageGoodsclass:edit")
	public R update( HomepageGoodsclassDO homepageGoodsclass){
		homepageGoodsclassService.update(homepageGoodsclass);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:homepageGoodsclass:remove")
	public R remove( Long id){
		if(homepageGoodsclassService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:homepageGoodsclass:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		homepageGoodsclassService.batchRemove(ids);
		return R.ok();
	}
	
}
