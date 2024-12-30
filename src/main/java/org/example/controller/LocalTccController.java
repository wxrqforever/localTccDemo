package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.seata.spring.annotation.GlobalTransactional;
import org.example.biz.LocalTccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author liangzaiwei
 *@date 2024年12月29日22:37
 */
@RestController
@Slf4j
public class LocalTccController {

    @Autowired
    LocalTccService localTccService;

    @GetMapping("/testTcc")
    @GlobalTransactional
    public boolean testTcc() {
        log.info("测试tcc事务务");
        localTccService.prepare(null);
        return true;
    }
}
