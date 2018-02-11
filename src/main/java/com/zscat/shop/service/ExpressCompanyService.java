package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ExpressCompanyDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface ExpressCompanyService {
	
	ExpressCompanyDO get(Long id);
	
	List<ExpressCompanyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExpressCompanyDO expressCompany);
	
	int update(ExpressCompanyDO expressCompany);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ExpressCompanyDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
