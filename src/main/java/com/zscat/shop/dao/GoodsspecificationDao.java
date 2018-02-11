package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsspecificationDO;

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
public interface GoodsspecificationDao {

	GoodsspecificationDO get(Long id);
	
	List<GoodsspecificationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsspecificationDO goodsspecification);
	
	int update(GoodsspecificationDO goodsspecification);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
