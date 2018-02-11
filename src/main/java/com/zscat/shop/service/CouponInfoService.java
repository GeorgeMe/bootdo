package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.CouponInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface CouponInfoService {
	
	CouponInfoDO get(Long id);
	
	List<CouponInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CouponInfoDO couponInfo);
	
	int update(CouponInfoDO couponInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	CouponInfoDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
