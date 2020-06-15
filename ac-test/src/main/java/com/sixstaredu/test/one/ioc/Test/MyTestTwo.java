package com.sixstaredu.test.one.ioc.Test;

import com.sixstaredu.test.one.ioc.two.config.MainConfig;
import com.sixstaredu.test.one.ioc.two.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    16:57
 * @Version: 1.0
 */
public class MyTestTwo {//实现包扫描进行注册

	public static void main(String[] args) {
		new MyTestTwo().test1();
	}
    public void test1() {
        //加载Spring注解配置类   初始化到spring容器中
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        //获取注册到容器中的组件name集合，遍历打印
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTwo.xml");

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        UserController bean1 = applicationContext.getBean(UserController.class);
        bean1.doRequest();
        UserController bean2 = applicationContext.getBean(UserController.class);
        bean2.doRequest();
        UserController bean3 = applicationContext.getBean(UserController.class);
        bean3.doRequest();
    }
}
