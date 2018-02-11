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

import com.zscat.shop.domain.AlbumDO;
import com.zscat.shop.service.AlbumService;
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
@RequestMapping("/shop/album")
public class AlbumController {
	@Autowired
	private AlbumService albumService;
	
	@GetMapping()
	@RequiresPermissions("shop:album:album")
	String Album(){
	    return "shop/album/album";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:album:album")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AlbumDO> albumList = albumService.list(query);
		int total = albumService.count(query);
		PageUtils pageUtils = new PageUtils(albumList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:album:add")
	String add(){
	    return "shop/album/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:album:edit")
	String edit(@PathVariable("id") Long id,Model model){
		AlbumDO album = albumService.get(id);
		model.addAttribute("album", album);
	    return "shop/album/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:album:add")
	public R save( AlbumDO album){
		if(albumService.save(album)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:album:edit")
	public R update( AlbumDO album){
		albumService.update(album);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:album:remove")
	public R remove( Long id){
		if(albumService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:album:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		albumService.batchRemove(ids);
		return R.ok();
	}
	
}
