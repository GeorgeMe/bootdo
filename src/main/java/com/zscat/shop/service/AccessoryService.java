package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.AccessoryDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface AccessoryService {
	
	AccessoryDO get(Long id);
	
	List<AccessoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AccessoryDO accessory);
	
	int update(AccessoryDO accessory);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	AccessoryDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
