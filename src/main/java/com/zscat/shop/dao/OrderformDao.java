package com.zscat.shop.dao;

import com.zscat.shop.domain.OrderformDO;

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
public interface OrderformDao {

	OrderformDO get(Long id);
	
	List<OrderformDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderformDO orderform);
	
	int update(OrderformDO orderform);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
