package com.zscat.shop.dao;

import com.zscat.shop.domain.StorePartnerDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
@Mapper
public interface StorePartnerDao {

	StorePartnerDO get(Long id);
	
	List<StorePartnerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StorePartnerDO storePartner);
	
	int update(StorePartnerDO storePartner);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
