package com.sixstaredu.test.one.ioc.two.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    16:45
 * @Version: 1.0
 */
@Configuration
//@ComponentScan 开启包扫描，value指定要扫描的包名
@ComponentScan(value = "com.sixstaredu.test.one.ioc.two")
//@Component中excludeFilters的简要说明
//这个注解会扫描指定的包及其子包，可以是一个字符串的数组
//excludeFilters：指定不扫描哪些组件，它的值也是一个@ComponentScan.Filter类型的数组
//可选类型有：
//FilterType.ANNOTATION 按照注解
//FilterType.ASSIGNABLE_TYPE 按照给定的类型
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

}
