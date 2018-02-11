package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.StorecartDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public interface StorecartService {
	
	StorecartDO get(Long id);
	
	List<StorecartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StorecartDO storecart);
	
	int update(StorecartDO storecart);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	StorecartDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
