package com.zscat.shop.dao;

import com.zscat.shop.domain.VmessageDO;

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
public interface VmessageDao {

	VmessageDO get(Long id);
	
	List<VmessageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VmessageDO vmessage);
	
	int update(VmessageDO vmessage);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
