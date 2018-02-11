package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ChattingDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface ChattingService {
	
	ChattingDO get(Long id);
	
	List<ChattingDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChattingDO chatting);
	
	int update(ChattingDO chatting);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ChattingDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
