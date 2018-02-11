package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodstypepropertyDO;

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
public interface GoodstypepropertyDao {

	GoodstypepropertyDO get(Long id);
	
	List<GoodstypepropertyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypepropertyDO goodstypeproperty);
	
	int update(GoodstypepropertyDO goodstypeproperty);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
