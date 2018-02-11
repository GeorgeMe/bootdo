package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.TemplateDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface TemplateService {
	
	TemplateDO get(Long id);
	
	List<TemplateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TemplateDO template);
	
	int update(TemplateDO template);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	TemplateDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
