package com.sixstaredu.test.one.ioc.five.controller;

import com.sixstaredu.test.one.ioc.five.service.impl.Man;
import com.sixstaredu.test.one.ioc.five.service.impl.ManCondition;
import com.sixstaredu.test.one.ioc.five.service.impl.Woman;
import com.sixstaredu.test.one.ioc.five.service.impl.WomanCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/6    13:31
 * @Version: 1.0
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(ManCondition.class)
    //如果ManCondition中的match方法返回结果true，就创建该Bean,否则不创建
    public Man getMan(){
        return new Man();
    }

    @Bean
    @Conditional(WomanCondition.class)
    public Woman getWoman(){
        return new Woman();
    }
}
