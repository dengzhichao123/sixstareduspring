package com.sixstaredu.test.one.ioc.two.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    16:40
 * @Version: 1.0
 */
@Controller
@Scope("prototype")
/**
 * singleton :单实例 (默认)
 * prototype :多实例 IOC初始化的时候不会创建好，只有getBean
 * request： 同一个请求创建一个实例
 * seesion： 同一个session创建一个实例
 */
public class UserController {
    private int index=0;
    private static int staticIndex=0;
    public String doRequest(){
        System.out.println("common attribute:"+(index++)+"=========" +
				"========= "+"static attribute:"+(staticIndex));
        return null;
    }

}
