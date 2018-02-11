package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.VisitDao;
import com.zscat.shop.domain.VisitDO;
import com.zscat.shop.service.VisitService;



@Service
public class VisitServiceImpl implements VisitService {
	@Autowired
	private VisitDao visitDao;
	
	@Override
	public VisitDO get(Long id){
		return visitDao.get(id);
	}
	
	@Override
	public List<VisitDO> list(Map<String, Object> map){
		return visitDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return visitDao.count(map);
	}
	
	@Override
	public int save(VisitDO visit){
		return visitDao.save(visit);
	}
	
	@Override
	public int update(VisitDO visit){
		return visitDao.update(visit);
	}
	
	@Override
	public int remove(Long id){
		return visitDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return visitDao.batchRemove(ids);
	}
    @Override
    public VisitDO selectOne(Map<String, Object> params) {
        List<VisitDO> list = visitDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<VisitDO> resList = visitDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
