package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodsCombinDO;

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
public interface GoodsCombinDao {

	GoodsCombinDO get(Long wemallGoodsId);
	
	List<GoodsCombinDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsCombinDO goodsCombin);
	
	int update(GoodsCombinDO goodsCombin);
	
	int remove(Long wemall_goods_id);
	
	int batchRemove(Long[] wemallGoodsIds);
}
