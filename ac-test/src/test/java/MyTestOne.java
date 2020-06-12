package com.sixstaredu.spring;

import com.sixstaredu.spring.ac.dayone.test.iocandbean.one.Acbean;
import com.sixstaredu.spring.ac.dayone.test.iocandbean.one.Xacbean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/5    15:02
 * @Version: 1.0
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class MyTestOne {
    @Test
    public void test1(){
        //加载Spring-xml配置文件   并且创建Bean
        ApplicationContext application1 = new ClassPathXmlApplicationContext("applicationContextOne.xml");

        //获取注册到容器中的组件name集合，遍历打印
        String[] beanDefinitionNames = application1.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name+"");}

        //从容器中获取bean
        Xacbean xo = (Xacbean) application1.getBean("xacbean");
        System.out.println(xo);
    }
    @Test
    //@ComponentScan

    public void test2(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        //加载Spring注解配置类
        AnnotationConfigApplicationContext application2 = new AnnotationConfigApplicationContext(Acbean.class);

        //获取注册到容器中的组件name集合，遍历打印
        String[] beanDefinitionNames = application2.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name+"得到");}

        //从容器中获取bean
        Xacbean xacbean = (Xacbean) application2.getBean("xacbean");
        Xacbean xacbean1 = (Xacbean) application2.getBean("xacbean");
        System.out.println(xacbean==xacbean1);
        System.out.println(xacbean);
        System.out.println(xacbean1);
    }
}
