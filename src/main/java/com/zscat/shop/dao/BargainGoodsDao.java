package com.zscat.shop.dao;

import com.zscat.shop.domain.BargainGoodsDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
@Mapper
public interface BargainGoodsDao {

	BargainGoodsDO get(Long id);
	
	List<BargainGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BargainGoodsDO bargainGoods);
	
	int update(BargainGoodsDO bargainGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
