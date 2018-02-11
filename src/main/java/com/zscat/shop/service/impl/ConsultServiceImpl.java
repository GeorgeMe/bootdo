package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ConsultDao;
import com.zscat.shop.domain.ConsultDO;
import com.zscat.shop.service.ConsultService;



@Service
public class ConsultServiceImpl implements ConsultService {
	@Autowired
	private ConsultDao consultDao;
	
	@Override
	public ConsultDO get(Long id){
		return consultDao.get(id);
	}
	
	@Override
	public List<ConsultDO> list(Map<String, Object> map){
		return consultDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return consultDao.count(map);
	}
	
	@Override
	public int save(ConsultDO consult){
		return consultDao.save(consult);
	}
	
	@Override
	public int update(ConsultDO consult){
		return consultDao.update(consult);
	}
	
	@Override
	public int remove(Long id){
		return consultDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return consultDao.batchRemove(ids);
	}
    @Override
    public ConsultDO selectOne(Map<String, Object> params) {
        List<ConsultDO> list = consultDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ConsultDO> resList = consultDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
