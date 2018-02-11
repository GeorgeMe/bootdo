package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ChattingfriendDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface ChattingfriendService {
	
	ChattingfriendDO get(Long id);
	
	List<ChattingfriendDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChattingfriendDO chattingfriend);
	
	int update(ChattingfriendDO chattingfriend);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ChattingfriendDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
