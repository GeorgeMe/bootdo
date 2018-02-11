package com.zscat.shop.dao;

import com.zscat.shop.domain.TransAreaDO;

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
public interface TransAreaDao {

	TransAreaDO get(Long id);
	
	List<TransAreaDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TransAreaDO transArea);
	
	int update(TransAreaDO transArea);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
