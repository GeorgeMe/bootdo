package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ComplaintSubjectDao;
import com.zscat.shop.domain.ComplaintSubjectDO;
import com.zscat.shop.service.ComplaintSubjectService;



@Service
public class ComplaintSubjectServiceImpl implements ComplaintSubjectService {
	@Autowired
	private ComplaintSubjectDao complaintSubjectDao;
	
	@Override
	public ComplaintSubjectDO get(Long id){
		return complaintSubjectDao.get(id);
	}
	
	@Override
	public List<ComplaintSubjectDO> list(Map<String, Object> map){
		return complaintSubjectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintSubjectDao.count(map);
	}
	
	@Override
	public int save(ComplaintSubjectDO complaintSubject){
		return complaintSubjectDao.save(complaintSubject);
	}
	
	@Override
	public int update(ComplaintSubjectDO complaintSubject){
		return complaintSubjectDao.update(complaintSubject);
	}
	
	@Override
	public int remove(Long id){
		return complaintSubjectDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return complaintSubjectDao.batchRemove(ids);
	}
    @Override
    public ComplaintSubjectDO selectOne(Map<String, Object> params) {
        List<ComplaintSubjectDO> list = complaintSubjectDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ComplaintSubjectDO> resList = complaintSubjectDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
