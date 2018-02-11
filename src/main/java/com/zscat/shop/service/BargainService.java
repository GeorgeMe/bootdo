package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.BargainDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface BargainService {
	
	BargainDO get(Long id);
	
	List<BargainDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BargainDO bargain);
	
	int update(BargainDO bargain);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	BargainDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
