package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsspecpropertyDO;

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
public interface GoodsspecpropertyDao {

	GoodsspecpropertyDO get(Long id);
	
	List<GoodsspecpropertyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsspecpropertyDO goodsspecproperty);
	
	int update(GoodsspecpropertyDO goodsspecproperty);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
