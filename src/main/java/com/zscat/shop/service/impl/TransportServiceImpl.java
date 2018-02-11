package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.TransportDao;
import com.zscat.shop.domain.TransportDO;
import com.zscat.shop.service.TransportService;



@Service
public class TransportServiceImpl implements TransportService {
	@Autowired
	private TransportDao transportDao;
	
	@Override
	public TransportDO get(Long id){
		return transportDao.get(id);
	}
	
	@Override
	public List<TransportDO> list(Map<String, Object> map){
		return transportDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return transportDao.count(map);
	}
	
	@Override
	public int save(TransportDO transport){
		return transportDao.save(transport);
	}
	
	@Override
	public int update(TransportDO transport){
		return transportDao.update(transport);
	}
	
	@Override
	public int remove(Long id){
		return transportDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return transportDao.batchRemove(ids);
	}
    @Override
    public TransportDO selectOne(Map<String, Object> params) {
        List<TransportDO> list = transportDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<TransportDO> resList = transportDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
