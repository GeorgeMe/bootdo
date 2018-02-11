package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.AdvPosDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface AdvPosService {
	
	AdvPosDO get(Long id);
	
	List<AdvPosDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvPosDO advPos);
	
	int update(AdvPosDO advPos);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	AdvPosDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
