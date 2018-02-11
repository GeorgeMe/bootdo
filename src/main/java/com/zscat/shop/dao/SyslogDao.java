package com.zscat.shop.dao;

import com.zscat.shop.domain.SyslogDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
@Mapper
public interface SyslogDao {

	SyslogDO get(Long id);
	
	List<SyslogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SyslogDO syslog);
	
	int update(SyslogDO syslog);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
