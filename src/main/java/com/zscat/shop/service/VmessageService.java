package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.VmessageDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface VmessageService {
	
	VmessageDO get(Long id);
	
	List<VmessageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VmessageDO vmessage);
	
	int update(VmessageDO vmessage);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	VmessageDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
