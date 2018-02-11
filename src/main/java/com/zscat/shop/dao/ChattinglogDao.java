package com.zscat.shop.dao;

import com.zscat.shop.domain.ChattinglogDO;

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
public interface ChattinglogDao {

	ChattinglogDO get(Long id);
	
	List<ChattinglogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChattinglogDO chattinglog);
	
	int update(ChattinglogDO chattinglog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
