package com.sixstaredu.test.one.ioc.Test;

import com.sixstaredu.test.one.ioc.five.controller.ConditionConfig;
import com.sixstaredu.test.one.ioc.five.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/6    13:34
 * @Version: 1.0
 */
public class MyTestFive {
	public static void main(String[] args) {
		new MyTestFive().test1();
	}
    public void test1(){
        ApplicationContext app = new AnnotationConfigApplicationContext(ConditionConfig.class);
        Person person = app.getBean(Person.class);
        //通过条件类判断，只有Woman的条件类返回true，所以在容器中只能找到Woman的实现类的装载bean,而Woman又是继承自Person的，所以，在容器中可以找到一个唯一的Bean,通过getBean获取到。
        System.out.println(person);
        person.birth();
    }
}
