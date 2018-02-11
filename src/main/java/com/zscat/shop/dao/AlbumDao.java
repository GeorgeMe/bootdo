package com.zscat.shop.dao;

import com.zscat.shop.domain.AlbumDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
@Mapper
public interface AlbumDao {

	AlbumDO get(Long id);
	
	List<AlbumDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AlbumDO album);
	
	int update(AlbumDO album);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
