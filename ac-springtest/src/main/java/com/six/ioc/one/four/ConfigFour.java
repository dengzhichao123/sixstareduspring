package com.six.ioc.one.two;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/13    22:20
 * @Version: 1.0
 */
@Configuration
//@ComponentScan(value = "com.six.ioc.one.two")
//开启包扫描  Component  Controller Repository  Service
//@ComponentScan(excludeFilters = FilterType.)
//excludeFilters  制定不扫描什么文件
public class Config {

}
