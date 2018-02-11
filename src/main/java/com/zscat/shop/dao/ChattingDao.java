package com.zscat.shop.dao;

import com.zscat.shop.domain.ChattingDO;

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
public interface ChattingDao {

	ChattingDO get(Long id);
	
	List<ChattingDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChattingDO chatting);
	
	int update(ChattingDO chatting);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
