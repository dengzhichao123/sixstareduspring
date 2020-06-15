package com.sixstaredu.test.one.ioc.three.config;

import com.sixstaredu.test.one.ioc.three.moudle.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    20:32
 * @Version: 1.0
 */
public class MyImportTwo implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param importingClassMetadata :当前标注了@Import注解的类的所有注解信息
     * @param registry ：容器中已注册组件的信息
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry){
        //判断容器中是否注册user
        boolean flag = registry.containsBeanDefinition("user");
        System.out.println("我已经判断"+flag);
        //指定Bean定义的信息--Bean的类型
        BeanDefinition beanDefinition = new RootBeanDefinition(User.class);
        //向容器中注册bean，并指定bean名
        registry.registerBeanDefinition("user", beanDefinition);
    }
}
