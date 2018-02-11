package com.zscat.shop.dao;

import com.zscat.shop.domain.DocumentDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
@Mapper
public interface DocumentDao {

	DocumentDO get(Long id);
	
	List<DocumentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DocumentDO document);
	
	int update(DocumentDO document);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
