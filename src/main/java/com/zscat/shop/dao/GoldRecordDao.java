package com.zscat.shop.dao;

import com.zscat.shop.domain.GoldRecordDO;

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
public interface GoldRecordDao {

	GoldRecordDO get(Long id);
	
	List<GoldRecordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoldRecordDO goldRecord);
	
	int update(GoldRecordDO goldRecord);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
