package com.sixstaredu.test.one.ioc.four;

import org.springframework.beans.factory.FactoryBean;
/**
 * @ClassName:
 * @Description: 说明 通过FactoryBean注入
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    21:48
 * @Version: 1.0
 */
public class IOCFactoryBean implements FactoryBean<User> {
    public User getObject() throws Exception {//指定对象
        System.out.println("Singleton: " + isSingleton());
        return new User();
    }

    public Class<?> getObjectType() {//指定类型
        return User.class;
    }

    public boolean isSingleton() {//指定是否为单例
        return true;
    }

}
