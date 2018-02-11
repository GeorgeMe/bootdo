package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ReportTypeDao;
import com.zscat.shop.domain.ReportTypeDO;
import com.zscat.shop.service.ReportTypeService;



@Service
public class ReportTypeServiceImpl implements ReportTypeService {
	@Autowired
	private ReportTypeDao reportTypeDao;
	
	@Override
	public ReportTypeDO get(Long id){
		return reportTypeDao.get(id);
	}
	
	@Override
	public List<ReportTypeDO> list(Map<String, Object> map){
		return reportTypeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return reportTypeDao.count(map);
	}
	
	@Override
	public int save(ReportTypeDO reportType){
		return reportTypeDao.save(reportType);
	}
	
	@Override
	public int update(ReportTypeDO reportType){
		return reportTypeDao.update(reportType);
	}
	
	@Override
	public int remove(Long id){
		return reportTypeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return reportTypeDao.batchRemove(ids);
	}
    @Override
    public ReportTypeDO selectOne(Map<String, Object> params) {
        List<ReportTypeDO> list = reportTypeDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ReportTypeDO> resList = reportTypeDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
