package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodstypepropertyDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodstypepropertyService {
	
	GoodstypepropertyDO get(Long id);
	
	List<GoodstypepropertyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodstypepropertyDO goodstypeproperty);
	
	int update(GoodstypepropertyDO goodstypeproperty);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodstypepropertyDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
