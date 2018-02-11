package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodstypeBrandDO;

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
public interface GoodstypeBrandDao {

	GoodstypeBrandDO get(Long typeId);
	
	List<GoodstypeBrandDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypeBrandDO goodstypeBrand);
	
	int update(GoodstypeBrandDO goodstypeBrand);
	
	int remove(Long type_id);
	
	int batchRemove(Long[] typeIds);
}
