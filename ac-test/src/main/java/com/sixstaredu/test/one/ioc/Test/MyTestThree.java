package com.sixstaredu.test.one.ioc.Test;


import com.sixstaredu.test.one.ioc.three.config.MainConfig;
import com.sixstaredu.test.one.ioc.three.config.MainConfigThree;
import com.sixstaredu.test.one.ioc.three.config.MainConfigTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/5    20:43
 * @Version: 1.0
 */
public class MyTestThree {
	public static void main(String[] args) {
		new MyTestThree().test1();
	}


    public void test1(){
        //加载Spring注解配置类
        ApplicationContext application = new AnnotationConfigApplicationContext(MainConfig.class);

        //获取注册到容器中的组件name集合，遍历打印
        String[] beanDefinitionNames = application.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

    public void test2(){
        //加载Spring注解配置类
        ApplicationContext application = new AnnotationConfigApplicationContext(MainConfigTwo.class);

        //获取注册到容器中的组件name集合，遍历打印
        String[] beanDefinitionNames = application.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

    public void test3(){
        //加载Spring注解配置类
        ApplicationContext application = new AnnotationConfigApplicationContext(MainConfigThree.class);

        //获取注册到容器中的组件name集合，遍历打印
        String[] beanDefinitionNames = application.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
