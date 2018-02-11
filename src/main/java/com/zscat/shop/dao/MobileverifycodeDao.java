package com.zscat.shop.dao;

import com.zscat.shop.domain.MobileverifycodeDO;

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
public interface MobileverifycodeDao {

	MobileverifycodeDO get(Long id);
	
	List<MobileverifycodeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MobileverifycodeDO mobileverifycode);
	
	int update(MobileverifycodeDO mobileverifycode);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
