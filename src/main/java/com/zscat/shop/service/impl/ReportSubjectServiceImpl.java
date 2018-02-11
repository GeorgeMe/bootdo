package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ReportSubjectDao;
import com.zscat.shop.domain.ReportSubjectDO;
import com.zscat.shop.service.ReportSubjectService;



@Service
public class ReportSubjectServiceImpl implements ReportSubjectService {
	@Autowired
	private ReportSubjectDao reportSubjectDao;
	
	@Override
	public ReportSubjectDO get(Long id){
		return reportSubjectDao.get(id);
	}
	
	@Override
	public List<ReportSubjectDO> list(Map<String, Object> map){
		return reportSubjectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return reportSubjectDao.count(map);
	}
	
	@Override
	public int save(ReportSubjectDO reportSubject){
		return reportSubjectDao.save(reportSubject);
	}
	
	@Override
	public int update(ReportSubjectDO reportSubject){
		return reportSubjectDao.update(reportSubject);
	}
	
	@Override
	public int remove(Long id){
		return reportSubjectDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return reportSubjectDao.batchRemove(ids);
	}
    @Override
    public ReportSubjectDO selectOne(Map<String, Object> params) {
        List<ReportSubjectDO> list = reportSubjectDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ReportSubjectDO> resList = reportSubjectDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
