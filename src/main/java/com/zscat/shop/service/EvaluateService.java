package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.EvaluateDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface EvaluateService {
	
	EvaluateDO get(Long id);
	
	List<EvaluateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(EvaluateDO evaluate);
	
	int update(EvaluateDO evaluate);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	EvaluateDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
