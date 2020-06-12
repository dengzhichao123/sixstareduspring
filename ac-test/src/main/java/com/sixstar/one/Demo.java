import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/10    18:55
 * @Version: 1.0
 */
public class Demo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextOne.xml");
		Object xacbean = classPathXmlApplicationContext.getBean("xacbean");
		System.out.println(xacbean);
	}
}
