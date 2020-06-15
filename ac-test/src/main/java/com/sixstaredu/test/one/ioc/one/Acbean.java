package com.sixstaredu.test.one.ioc.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName:
 * @Description: 说明 @Bean注解
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    17:30
 * @Version: 1.0
 */
@Configuration //标注这是一个注解配置类，该类就相当于spring的配置文件applictionContext.xml
public class Acbean {
	/**
	 * @Bean表示向IOC容器中注册bean，value指定bean名称，如果不指定，默认使用方法名
	 */
	//@Scope:调整作用域
	//	 * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。每次获取的时候才会调用方法创建对象；
	//	 * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。以后每次获取就是直接从容器（map.get()）中拿，
	//	 * request：同一次请求创建一个实例
	//	 * session：同一个session创建一个实例
	//@Scope(value = ConfigurableBeanFactory)
	//@Scope(value = WebApplicationContext)

	//懒加载：
	//	 * 单实例bean：默认在容器启动的时候创建对象；
	//	 * 懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
	@Bean
	@Lazy(value = true)
	public Xacbean xacbean(){
		System.out.println("My Create XmlOne------");
		return new Xacbean("ac", 18, "man");
	}
}
