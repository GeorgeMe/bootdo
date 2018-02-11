package com.zscat.shop.dao;

import com.zscat.shop.domain.CouponInfoDO;

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
public interface CouponInfoDao {

	CouponInfoDO get(Long id);
	
	List<CouponInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CouponInfoDO couponInfo);
	
	int update(CouponInfoDO couponInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
