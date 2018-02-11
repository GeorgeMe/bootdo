package com.zscat.shop.dao;

import com.zscat.shop.domain.PredepositDO;

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
public interface PredepositDao {

	PredepositDO get(Long id);
	
	List<PredepositDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PredepositDO predeposit);
	
	int update(PredepositDO predeposit);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
