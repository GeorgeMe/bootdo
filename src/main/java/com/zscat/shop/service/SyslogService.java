package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.SyslogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public interface SyslogService {
	
	SyslogDO get(Long id);
	
	List<SyslogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SyslogDO syslog);
	
	int update(SyslogDO syslog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	SyslogDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
