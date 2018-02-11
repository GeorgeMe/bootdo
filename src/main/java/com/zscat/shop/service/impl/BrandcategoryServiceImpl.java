package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.BrandcategoryDao;
import com.zscat.shop.domain.BrandcategoryDO;
import com.zscat.shop.service.BrandcategoryService;



@Service
public class BrandcategoryServiceImpl implements BrandcategoryService {
	@Autowired
	private BrandcategoryDao brandcategoryDao;
	
	@Override
	public BrandcategoryDO get(Long id){
		return brandcategoryDao.get(id);
	}
	
	@Override
	public List<BrandcategoryDO> list(Map<String, Object> map){
		return brandcategoryDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return brandcategoryDao.count(map);
	}
	
	@Override
	public int save(BrandcategoryDO brandcategory){
		return brandcategoryDao.save(brandcategory);
	}
	
	@Override
	public int update(BrandcategoryDO brandcategory){
		return brandcategoryDao.update(brandcategory);
	}
	
	@Override
	public int remove(Long id){
		return brandcategoryDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return brandcategoryDao.batchRemove(ids);
	}
    @Override
    public BrandcategoryDO selectOne(Map<String, Object> params) {
        List<BrandcategoryDO> list = brandcategoryDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<BrandcategoryDO> resList = brandcategoryDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
