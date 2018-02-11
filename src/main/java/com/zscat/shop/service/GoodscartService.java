package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.GoodscartDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public interface GoodscartService {
	
	GoodscartDO get(Long id);
	
	List<GoodscartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodscartDO goodscart);
	
	int update(GoodscartDO goodscart);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	GoodscartDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
