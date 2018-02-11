package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.SysconfigDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface SysconfigService {
	
	SysconfigDO get(Long id);
	
	List<SysconfigDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SysconfigDO sysconfig);
	
	int update(SysconfigDO sysconfig);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	SysconfigDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
