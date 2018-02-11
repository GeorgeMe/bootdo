package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ComplaintDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public interface ComplaintService {
	
	ComplaintDO get(Long id);
	
	List<ComplaintDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintDO complaint);
	
	int update(ComplaintDO complaint);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ComplaintDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
