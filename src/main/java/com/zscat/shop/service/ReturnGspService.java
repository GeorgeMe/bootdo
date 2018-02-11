package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ReturnGspDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface ReturnGspService {
	
	ReturnGspDO get(Long itemId);
	
	List<ReturnGspDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReturnGspDO returnGsp);
	
	int update(ReturnGspDO returnGsp);
	
	int remove(Long itemId);
	
	int batchRemove(Long[] itemIds);

	ReturnGspDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
