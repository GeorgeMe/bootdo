package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ReportDao;
import com.zscat.shop.domain.ReportDO;
import com.zscat.shop.service.ReportService;



@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	private ReportDao reportDao;
	
	@Override
	public ReportDO get(Long id){
		return reportDao.get(id);
	}
	
	@Override
	public List<ReportDO> list(Map<String, Object> map){
		return reportDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return reportDao.count(map);
	}
	
	@Override
	public int save(ReportDO report){
		return reportDao.save(report);
	}
	
	@Override
	public int update(ReportDO report){
		return reportDao.update(report);
	}
	
	@Override
	public int remove(Long id){
		return reportDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return reportDao.batchRemove(ids);
	}
    @Override
    public ReportDO selectOne(Map<String, Object> params) {
        List<ReportDO> list = reportDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ReportDO> resList = reportDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
