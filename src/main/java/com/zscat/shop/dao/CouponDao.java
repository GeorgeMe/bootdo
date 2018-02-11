package com.zscat.shop.dao;

import com.zscat.shop.domain.CouponDO;

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
public interface CouponDao {

	CouponDO get(Long id);
	
	List<CouponDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CouponDO coupon);
	
	int update(CouponDO coupon);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
