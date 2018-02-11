package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.DocumentDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface DocumentService {
	
	DocumentDO get(Long id);
	
	List<DocumentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DocumentDO document);
	
	int update(DocumentDO document);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	DocumentDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
