package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.VlogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface VlogService {
	
	VlogDO get(Long id);
	
	List<VlogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VlogDO vlog);
	
	int update(VlogDO vlog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	VlogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
