package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsFloorDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
@Mapper
public interface GoodsFloorDao {

	GoodsFloorDO get(Long id);
	
	List<GoodsFloorDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsFloorDO goodsFloor);
	
	int update(GoodsFloorDO goodsFloor);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
