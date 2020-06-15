package com.six.ioc.one.test;

import com.six.ioc.one.two.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/13    22:19
 * @Version: 1.0
 */
public class TestTwo {
	public static void main(String[] args) {


		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(Config.class);
		//获取注册到  IOc容器里面的Bean
		String[] beanDefinitionNames = a.getBeanDefinitionNames();
		for (String name : beanDefinitionNames){
			System.out.println(name);
		}
	}
}
