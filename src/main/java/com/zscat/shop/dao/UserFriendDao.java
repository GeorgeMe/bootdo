package com.zscat.shop.dao;

import com.zscat.shop.domain.UserFriendDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
@Mapper
public interface UserFriendDao {

	UserFriendDO get(Long id);
	
	List<UserFriendDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserFriendDO userFriend);
	
	int update(UserFriendDO userFriend);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
