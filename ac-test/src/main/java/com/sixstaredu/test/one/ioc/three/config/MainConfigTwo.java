package com.sixstaredu.test.one.ioc.three.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    20:25
 * @Version: 1.0
 */
@Configuration
@Import(MyImport.class)
public class MainConfigTwo {
}
