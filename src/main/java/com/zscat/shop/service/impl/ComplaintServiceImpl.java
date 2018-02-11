package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ComplaintDao;
import com.zscat.shop.domain.ComplaintDO;
import com.zscat.shop.service.ComplaintService;



@Service
public class ComplaintServiceImpl implements ComplaintService {
	@Autowired
	private ComplaintDao complaintDao;
	
	@Override
	public ComplaintDO get(Long id){
		return complaintDao.get(id);
	}
	
	@Override
	public List<ComplaintDO> list(Map<String, Object> map){
		return complaintDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintDao.count(map);
	}
	
	@Override
	public int save(ComplaintDO complaint){
		return complaintDao.save(complaint);
	}
	
	@Override
	public int update(ComplaintDO complaint){
		return complaintDao.update(complaint);
	}
	
	@Override
	public int remove(Long id){
		return complaintDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return complaintDao.batchRemove(ids);
	}
    @Override
    public ComplaintDO selectOne(Map<String, Object> params) {
        List<ComplaintDO> list = complaintDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ComplaintDO> resList = complaintDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
