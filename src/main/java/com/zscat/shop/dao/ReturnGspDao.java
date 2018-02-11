package com.zscat.shop.dao;

import com.zscat.shop.domain.ReturnGspDO;

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
public interface ReturnGspDao {

	ReturnGspDO get(Long itemId);
	
	List<ReturnGspDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReturnGspDO returnGsp);
	
	int update(ReturnGspDO returnGsp);
	
	int remove(Long item_id);
	
	int batchRemove(Long[] itemIds);
}
