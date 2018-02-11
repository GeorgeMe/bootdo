package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.TransportDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface TransportService {
	
	TransportDO get(Long id);
	
	List<TransportDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TransportDO transport);
	
	int update(TransportDO transport);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	TransportDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
