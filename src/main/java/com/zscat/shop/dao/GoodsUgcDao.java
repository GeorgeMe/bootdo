package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsUgcDO;

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
public interface GoodsUgcDao {

	GoodsUgcDO get(Long goodsId);
	
	List<GoodsUgcDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsUgcDO goodsUgc);
	
	int update(GoodsUgcDO goodsUgc);
	
	int remove(Long goods_id);
	
	int batchRemove(Long[] goodsIds);
}
