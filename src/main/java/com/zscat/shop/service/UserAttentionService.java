package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.UserAttentionDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface UserAttentionService {
	
	UserAttentionDO get(Long id);
	
	List<UserAttentionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserAttentionDO userAttention);
	
	int update(UserAttentionDO userAttention);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	UserAttentionDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
