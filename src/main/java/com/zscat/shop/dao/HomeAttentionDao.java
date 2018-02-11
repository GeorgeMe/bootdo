package com.zscat.shop.dao;

import com.zscat.shop.domain.HomeAttentionDO;

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
public interface HomeAttentionDao {

	HomeAttentionDO get(Long id);
	
	List<HomeAttentionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HomeAttentionDO homeAttention);
	
	int update(HomeAttentionDO homeAttention);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
