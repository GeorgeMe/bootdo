package com.zscat.shop.dao;

import com.zscat.shop.domain.CombinLogDO;

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
public interface CombinLogDao {

	CombinLogDO get(Long id);
	
	List<CombinLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CombinLogDO combinLog);
	
	int update(CombinLogDO combinLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
