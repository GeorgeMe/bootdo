package com.zscat.shop.dao;

import com.zscat.shop.domain.TransportDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
@Mapper
public interface TransportDao {

	TransportDO get(Long id);
	
	List<TransportDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TransportDO transport);
	
	int update(TransportDO transport);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
