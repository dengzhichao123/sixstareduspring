package com.sixstaredu.test.one.ioc.five.service;

/**
 * @ClassName:
 * @Description: 说明 创建服务接口
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/13    13:24
 * @Version: 1.0
 */
public interface Person {
    //创建一个人的接口，并创建一个服务方法，
    // 然后通过该接口分别实现一个男人和一个女人的实现类，通过注解去判断装载的bean。
    //定义一个生小孩的方法
    void birth();
}
