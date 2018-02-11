package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.VisitDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface VisitService {
	
	VisitDO get(Long id);
	
	List<VisitDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VisitDO visit);
	
	int update(VisitDO visit);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	VisitDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
