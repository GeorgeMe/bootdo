package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ExpressCompanyDao;
import com.zscat.shop.domain.ExpressCompanyDO;
import com.zscat.shop.service.ExpressCompanyService;



@Service
public class ExpressCompanyServiceImpl implements ExpressCompanyService {
	@Autowired
	private ExpressCompanyDao expressCompanyDao;
	
	@Override
	public ExpressCompanyDO get(Long id){
		return expressCompanyDao.get(id);
	}
	
	@Override
	public List<ExpressCompanyDO> list(Map<String, Object> map){
		return expressCompanyDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return expressCompanyDao.count(map);
	}
	
	@Override
	public int save(ExpressCompanyDO expressCompany){
		return expressCompanyDao.save(expressCompany);
	}
	
	@Override
	public int update(ExpressCompanyDO expressCompany){
		return expressCompanyDao.update(expressCompany);
	}
	
	@Override
	public int remove(Long id){
		return expressCompanyDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return expressCompanyDao.batchRemove(ids);
	}
    @Override
    public ExpressCompanyDO selectOne(Map<String, Object> params) {
        List<ExpressCompanyDO> list = expressCompanyDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ExpressCompanyDO> resList = expressCompanyDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
