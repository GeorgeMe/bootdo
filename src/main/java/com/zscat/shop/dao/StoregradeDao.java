package com.zscat.shop.dao;

import com.zscat.shop.domain.StoregradeDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
@Mapper
public interface StoregradeDao {

	StoregradeDO get(Long id);
	
	List<StoregradeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoregradeDO storegrade);
	
	int update(StoregradeDO storegrade);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
