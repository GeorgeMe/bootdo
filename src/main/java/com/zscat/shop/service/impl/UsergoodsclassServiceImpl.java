package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.UsergoodsclassDao;
import com.zscat.shop.domain.UsergoodsclassDO;
import com.zscat.shop.service.UsergoodsclassService;



@Service
public class UsergoodsclassServiceImpl implements UsergoodsclassService {
	@Autowired
	private UsergoodsclassDao usergoodsclassDao;
	
	@Override
	public UsergoodsclassDO get(Long id){
		return usergoodsclassDao.get(id);
	}
	
	@Override
	public List<UsergoodsclassDO> list(Map<String, Object> map){
		return usergoodsclassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return usergoodsclassDao.count(map);
	}
	
	@Override
	public int save(UsergoodsclassDO usergoodsclass){
		return usergoodsclassDao.save(usergoodsclass);
	}
	
	@Override
	public int update(UsergoodsclassDO usergoodsclass){
		return usergoodsclassDao.update(usergoodsclass);
	}
	
	@Override
	public int remove(Long id){
		return usergoodsclassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return usergoodsclassDao.batchRemove(ids);
	}
    @Override
    public UsergoodsclassDO selectOne(Map<String, Object> params) {
        List<UsergoodsclassDO> list = usergoodsclassDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<UsergoodsclassDO> resList = usergoodsclassDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}
