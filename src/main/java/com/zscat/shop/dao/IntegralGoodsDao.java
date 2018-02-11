package com.zscat.shop.dao;

import com.zscat.shop.domain.IntegralGoodsDO;

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
public interface IntegralGoodsDao {

	IntegralGoodsDO get(Long id);
	
	List<IntegralGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IntegralGoodsDO integralGoods);
	
	int update(IntegralGoodsDO integralGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
