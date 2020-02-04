package com.obj.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: LogTest
 * @Auther: medo
 * @Date: 2020-02-04 19:46
 * @Description: TODO
 **/

@RunWith(SpringRunner.class)
// 通过lombok包，省去创建实现类的步骤
@Slf4j
public class LogTest2 {


    @Test
    public void testLogger(){
        log.debug("test+debug.....");
        log.info("test+info.....");
        log.error("test+error......");

    }

}
