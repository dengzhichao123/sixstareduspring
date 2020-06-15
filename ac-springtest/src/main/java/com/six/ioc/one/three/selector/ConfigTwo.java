package com.six.ioc.one.three;

import com.six.ioc.one.three.User;
import com.six.ioc.one.three.UserOne;
import com.six.ioc.one.three.UserTwo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/13    22:20
 * @Version: 1.0
 */
//默认Id  是全类名
@Import({User.class, UserOne.class, UserTwo.class})  //注册多个
public class Config {

}
