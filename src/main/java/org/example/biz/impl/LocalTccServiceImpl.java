package org.example.biz.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.seata.rm.tcc.api.BusinessActionContext;
import org.example.biz.LocalTccService;
import org.springframework.stereotype.Service;

/**
 *@author liangzaiwei
 *@date 2024年12月29日23:03
 */
@Service
@Slf4j
public class LocalTccServiceImpl implements LocalTccService {

    @Override
    public boolean prepare(BusinessActionContext actionContext) {
        log.info("prepare is call");
        int i = 1/0;
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        log.info("commit is call");
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        log.info("rollback is call");
        return true;
    }
}
