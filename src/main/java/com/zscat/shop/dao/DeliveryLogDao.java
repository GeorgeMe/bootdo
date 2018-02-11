package com.zscat.shop.dao;

import com.zscat.shop.domain.DeliveryLogDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
@Mapper
public interface DeliveryLogDao {

	DeliveryLogDO get(Long id);
	
	List<DeliveryLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DeliveryLogDO deliveryLog);
	
	int update(DeliveryLogDO deliveryLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
