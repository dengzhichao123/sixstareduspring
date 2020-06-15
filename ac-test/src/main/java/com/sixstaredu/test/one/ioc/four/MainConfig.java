package com.sixstaredu.test.one.ioc.four;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    21:52
 * @Version: 1.0
 */
@Configuration
public class MainConfig {
    @Bean
    public IOCFactoryBean iocFactoryBean(){
        return new IOCFactoryBean();
    }
}
