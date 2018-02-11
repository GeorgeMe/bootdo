package com.zscat.shop.dao;

import com.zscat.shop.domain.PredepositCashDO;

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
public interface PredepositCashDao {

	PredepositCashDO get(Long id);
	
	List<PredepositCashDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PredepositCashDO predepositCash);
	
	int update(PredepositCashDO predepositCash);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
