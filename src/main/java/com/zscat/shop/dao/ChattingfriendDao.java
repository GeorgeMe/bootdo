package com.zscat.shop.dao;

import com.zscat.shop.domain.ChattingfriendDO;

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
public interface ChattingfriendDao {

	ChattingfriendDO get(Long id);
	
	List<ChattingfriendDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChattingfriendDO chattingfriend);
	
	int update(ChattingfriendDO chattingfriend);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
