package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.UserFriendDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface UserFriendService {
	
	UserFriendDO get(Long id);
	
	List<UserFriendDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserFriendDO userFriend);
	
	int update(UserFriendDO userFriend);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	UserFriendDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
