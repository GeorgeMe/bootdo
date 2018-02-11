package com.zscat.shop.dao;

import com.zscat.shop.domain.HomepageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
@Mapper
public interface HomepageDao {

	HomepageDO get(Long id);
	
	List<HomepageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HomepageDO homepage);
	
	int update(HomepageDO homepage);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
