package com.zscat.shop.dao;

import com.zscat.shop.domain.StoreclassDO;

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
public interface StoreclassDao {

	StoreclassDO get(Long id);
	
	List<StoreclassDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StoreclassDO storeclass);
	
	int update(StoreclassDO storeclass);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
