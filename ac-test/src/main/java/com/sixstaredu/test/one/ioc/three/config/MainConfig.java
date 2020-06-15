package com.sixstaredu.test.one.ioc.three.config;

import com.sixstaredu.test.one.ioc.three.moudle.User;
import com.sixstaredu.test.one.ioc.three.moudle.UserThree;
import com.sixstaredu.test.one.ioc.three.moudle.UserTwo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    20:25
 * @Version: 1.0
 */
@Configuration
//@Import 快速给容器中导入一个组件，默认id是全类名
//@Import(User.class)     //注册一个
@Import({User.class, UserTwo.class, UserThree.class}) //注册多个
public class MainConfig {
}
