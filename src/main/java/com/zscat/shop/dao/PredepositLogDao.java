package com.zscat.shop.dao;

import com.zscat.shop.domain.PredepositLogDO;

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
public interface PredepositLogDao {

	PredepositLogDO get(Long id);
	
	List<PredepositLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PredepositLogDO predepositLog);
	
	int update(PredepositLogDO predepositLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
