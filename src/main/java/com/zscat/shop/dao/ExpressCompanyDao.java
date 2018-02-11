package com.zscat.shop.dao;

import com.zscat.shop.domain.ExpressCompanyDO;

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
public interface ExpressCompanyDao {

	ExpressCompanyDO get(Long id);
	
	List<ExpressCompanyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExpressCompanyDO expressCompany);
	
	int update(ExpressCompanyDO expressCompany);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
