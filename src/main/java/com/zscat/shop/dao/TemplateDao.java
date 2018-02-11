package com.zscat.shop.dao;

import com.zscat.shop.domain.TemplateDO;

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
public interface TemplateDao {

	TemplateDO get(Long id);
	
	List<TemplateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TemplateDO template);
	
	int update(TemplateDO template);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
