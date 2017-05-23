package com.op.flow.manage.dao;

import com.op.flow.manage.dao.base.BaseGPDao;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * Created by 孟凡伟 on 2017/5/4.
 */
@Repository
public class MyBatisGPDemoDao extends BaseGPDao {
    private static final Logger logger = Logger.getLogger(MyBatisGPDemoDao.class);

    /** namespace */
    private final String namespace = MyBatisGPDemoDao.class.getName();

    public int queryCount(){
        long st = System.currentTimeMillis();
        int count = (int)this.queryCountForObject(namespace + ".queryCount", null);
        logger.info(System.currentTimeMillis() - st);
        return count;
    }
}
