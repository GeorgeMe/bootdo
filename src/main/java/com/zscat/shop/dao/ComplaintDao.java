package com.zscat.shop.dao;

import com.zscat.shop.domain.ComplaintDO;

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
public interface ComplaintDao {

	ComplaintDO get(Long id);
	
	List<ComplaintDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintDO complaint);
	
	int update(ComplaintDO complaint);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
