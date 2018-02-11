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

import com.zscat.shop.domain.ArticleclassDO;
import com.zscat.shop.service.ArticleclassService;
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
@RequestMapping("/shop/articleclass")
public class ArticleclassController {
	@Autowired
	private ArticleclassService articleclassService;
	
	@GetMapping()
	@RequiresPermissions("shop:articleclass:articleclass")
	String Articleclass(){
	    return "shop/articleclass/articleclass";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:articleclass:articleclass")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ArticleclassDO> articleclassList = articleclassService.list(query);
		int total = articleclassService.count(query);
		PageUtils pageUtils = new PageUtils(articleclassList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:articleclass:add")
	String add(){
	    return "shop/articleclass/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:articleclass:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ArticleclassDO articleclass = articleclassService.get(id);
		model.addAttribute("articleclass", articleclass);
	    return "shop/articleclass/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:articleclass:add")
	public R save( ArticleclassDO articleclass){
		if(articleclassService.save(articleclass)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:articleclass:edit")
	public R update( ArticleclassDO articleclass){
		articleclassService.update(articleclass);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:articleclass:remove")
	public R remove( Long id){
		if(articleclassService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:articleclass:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		articleclassService.batchRemove(ids);
		return R.ok();
	}
	
}
