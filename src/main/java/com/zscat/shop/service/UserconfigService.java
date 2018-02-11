package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.UserconfigDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface UserconfigService {
	
	UserconfigDO get(Long id);
	
	List<UserconfigDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserconfigDO userconfig);
	
	int update(UserconfigDO userconfig);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	UserconfigDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
