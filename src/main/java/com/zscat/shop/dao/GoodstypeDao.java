package com.zscat.shop.dao;

import com.zscat.shop.domain.GoodstypeDO;

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
public interface GoodstypeDao {

	GoodstypeDO get(Long id);
	
	List<GoodstypeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypeDO goodstype);
	
	int update(GoodstypeDO goodstype);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
