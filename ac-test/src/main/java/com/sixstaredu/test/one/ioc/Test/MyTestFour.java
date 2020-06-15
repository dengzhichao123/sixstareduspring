package com.sixstaredu.test.one.ioc.Test;

import com.sixstaredu.test.one.ioc.four.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/5    21:54
 * @Version: 1.0
 */
public class MyTestFour {
	public static void main(String[] args) {
		new MyTestFour().test();
	}
    public void test(){//FactoryBean注入
        //运行结果如下，发现类型竟然不是 iocFactoryBean ，使用@Bean注册的组件类型不是方法的返回值吗？
        // 实际上，iocFactoryBean注册的时候调用的了 getObject() 方法，所以注册的是 user 类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //工厂Bean获取的是调用getObject创建的对象
        Object userBean = applicationContext.getBean("iocFactoryBean");
        Object userBean2 = applicationContext.getBean("iocFactoryBean");
        System.out.println(userBean.getClass());
        System.out.println(userBean==userBean2);
        //前面加一个& 获取的就是IocFactoryBean的本身实例  可以debug看看
        //那么如果想要获得 FoodFactoryBean 类怎么办呢？
        //看一下 BeanFactory 的源码，定义了一个成员变量 FACTORY_BEAN_PREFIX
        //这个变量用于取消引用 FactoryBean 实例，并将其与由 FactoryBean 创建的bean区别开。
        //例如，如果名为 iocFactoryBean 的 bean 是 FactoryBean，则获取 &iocFactoryBean 将返回工厂，而不是工厂返回的实例。
        //所以在getBean的时候，在 id 前加上 & 即可
        Object iocFactoryBean = applicationContext.getBean("&iocFactoryBean");//取得FactoryBean
        System.out.println(iocFactoryBean.getClass());
    }
}
