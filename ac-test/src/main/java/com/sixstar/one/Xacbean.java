package com.sixstar.one;

/**
 * @ClassName: Xacbean
 * @Description: 说明 xml注册bean形式
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/3    13:47
 * @Version: 1.0
 */
public class Xacbean {
	private String name;
//SpEL表达式
	private Integer age;

	private  String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Xacbean(){}

	public Xacbean(String name, Integer age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Xacbean{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				'}';
	}
}
