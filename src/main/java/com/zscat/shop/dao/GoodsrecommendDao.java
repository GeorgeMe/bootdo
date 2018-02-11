package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsrecommendDO;

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
public interface GoodsrecommendDao {

	GoodsrecommendDO get(Long id);
	
	List<GoodsrecommendDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsrecommendDO goodsrecommend);
	
	int update(GoodsrecommendDO goodsrecommend);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
