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

import com.zscat.shop.domain.GoodsclassDO;
import com.zscat.shop.service.GoodsclassService;
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
@RequestMapping("/shop/goodsclass")
public class GoodsclassController {
	@Autowired
	private GoodsclassService goodsclassService;
	
	@GetMapping()
	@RequiresPermissions("shop:goodsclass:goodsclass")
	String Goodsclass(){
	    return "shop/goodsclass/goodsclass";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:goodsclass:goodsclass")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GoodsclassDO> goodsclassList = goodsclassService.list(query);
		int total = goodsclassService.count(query);
		PageUtils pageUtils = new PageUtils(goodsclassList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:goodsclass:add")
	String add(){
	    return "shop/goodsclass/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:goodsclass:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GoodsclassDO goodsclass = goodsclassService.get(id);
		model.addAttribute("goodsclass", goodsclass);
	    return "shop/goodsclass/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:goodsclass:add")
	public R save( GoodsclassDO goodsclass){
		if(goodsclassService.save(goodsclass)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:goodsclass:edit")
	public R update( GoodsclassDO goodsclass){
		goodsclassService.update(goodsclass);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:goodsclass:remove")
	public R remove( Long id){
		if(goodsclassService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:goodsclass:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		goodsclassService.batchRemove(ids);
		return R.ok();
	}
	
}
