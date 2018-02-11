package com.zscat.shop.dao;

import com.zscat.shop.domain.CartGspDO;

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
public interface CartGspDao {

	CartGspDO get(Long cartId);
	
	List<CartGspDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CartGspDO cartGsp);
	
	int update(CartGspDO cartGsp);
	
	int remove(Long cart_id);
	
	int batchRemove(Long[] cartIds);
}
