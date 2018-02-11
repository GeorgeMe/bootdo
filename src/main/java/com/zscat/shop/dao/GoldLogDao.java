package com.zscat.shop.dao;

import com.zscat.shop.domain.GoldLogDO;

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
public interface GoldLogDao {

	GoldLogDO get(Long id);
	
	List<GoldLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoldLogDO goldLog);
	
	int update(GoldLogDO goldLog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
