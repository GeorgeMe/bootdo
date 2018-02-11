package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.HomeAttentionDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface HomeAttentionService {
	
	HomeAttentionDO get(Long id);
	
	List<HomeAttentionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HomeAttentionDO homeAttention);
	
	int update(HomeAttentionDO homeAttention);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	HomeAttentionDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
