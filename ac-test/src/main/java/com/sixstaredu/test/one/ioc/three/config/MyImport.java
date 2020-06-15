package com.sixstaredu.test.one.ioc.three.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName:
 * @Description: 说明 实现ImportSelector接口，自定义返回要注册的组件
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/12    20:27
 * @Version: 1.0
 */
public class MyImport implements ImportSelector {
    /**
     * AnnotationMetadata 当前标注@Import注解的类的所有注释信息
     * @param importingClassMetadata
     * @return 要导入到容器中的组件全类名
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.sixstaredu.test.one.ioc.three.moudle.User", "com.sixstaredu.test.one.ioc.three.moudle.UserThree"};
    }

}
