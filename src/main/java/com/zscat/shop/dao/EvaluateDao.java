package com.zscat.shop.dao;

import com.zscat.shop.domain.EvaluateDO;

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
public interface EvaluateDao {

	EvaluateDO get(Long id);
	
	List<EvaluateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(EvaluateDO evaluate);
	
	int update(EvaluateDO evaluate);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
