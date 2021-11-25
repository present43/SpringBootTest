package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    // 使用日志 先返回日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        // springBoot 默认的是info级别
        logger.info("。。");
        logger.warn("警告信息");
    }

}
