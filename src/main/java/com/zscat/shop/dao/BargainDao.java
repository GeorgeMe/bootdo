package com.zscat.shop.dao;

import com.zscat.shop.domain.BargainDO;

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
public interface BargainDao {

	BargainDO get(Long id);
	
	List<BargainDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BargainDO bargain);
	
	int update(BargainDO bargain);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
