package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodsbrandDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodsbrandService {
	
	GoodsbrandDO get(Long id);
	
	List<GoodsbrandDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsbrandDO goodsbrand);
	
	int update(GoodsbrandDO goodsbrand);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodsbrandDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
