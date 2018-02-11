package com.zscat.shop.dao;

import com.zscat.shop.domain.ConsultDO;

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
public interface ConsultDao {

	ConsultDO get(Long id);
	
	List<ConsultDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ConsultDO consult);
	
	int update(ConsultDO consult);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
