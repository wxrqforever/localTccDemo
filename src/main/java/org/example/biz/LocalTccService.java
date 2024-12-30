package org.example.biz;

import org.apache.seata.rm.tcc.api.BusinessActionContext;
import org.apache.seata.rm.tcc.api.LocalTCC;
import org.apache.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 *@author liangzaiwei
 *@date 2024年12月29日23:02
 */

@LocalTCC
public interface LocalTccService {

    @TwoPhaseBusinessAction(name = "LocalTccTestBean", commitMethod = "commit", rollbackMethod = "rollback")
    boolean prepare(BusinessActionContext actionContext);;

    boolean commit(BusinessActionContext actionContext);


    boolean rollback(BusinessActionContext actionContext);
}
