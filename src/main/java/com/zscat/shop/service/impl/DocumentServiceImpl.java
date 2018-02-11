package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.DocumentDao;
import com.zscat.shop.domain.DocumentDO;
import com.zscat.shop.service.DocumentService;



@Service
public class DocumentServiceImpl implements DocumentService {
	@Autowired
	private DocumentDao documentDao;
	
	@Override
	public DocumentDO get(Long id){
		return documentDao.get(id);
	}
	
	@Override
	public List<DocumentDO> list(Map<String, Object> map){
		return documentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return documentDao.count(map);
	}
	
	@Override
	public int save(DocumentDO document){
		return documentDao.save(document);
	}
	
	@Override
	public int update(DocumentDO document){
		return documentDao.update(document);
	}
	
	@Override
	public int remove(Long id){
		return documentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return documentDao.batchRemove(ids);
	}
    @Override
    public DocumentDO selectOne(Map<String, Object> params) {
        List<DocumentDO> list = documentDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<DocumentDO> resList = documentDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
