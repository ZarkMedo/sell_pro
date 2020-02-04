package com.obj.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: LogTest
 * @Auther: medo
 * @Date: 2020-02-04 19:46
 * @Description: TODO
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {

    // 创建slf4j的实现类
    // 通过logger工厂类获取logger实现类，传入当前类的字节码文件
    private Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void testLogger(){
        logger.debug("test+debug.....");
        logger.info("test+info.....");
        logger.error("test+error......");

    }

}
