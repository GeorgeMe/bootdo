package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodstypeSpecDO;

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
public interface GoodstypeSpecDao {

	GoodstypeSpecDO get(Long typeId);
	
	List<GoodstypeSpecDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypeSpecDO goodstypeSpec);
	
	int update(GoodstypeSpecDO goodstypeSpec);
	
	int remove(Long type_id);
	
	int batchRemove(Long[] typeIds);
}
