package com.six.ioc.one.two;

/**
 * @ClassName:
 * @Description: 说明
 * @Author: 六星教育-阿超老师
 * @CreateDate: 2020/6/13    21:42
 * @Version: 1.0
 */

public class User {
		private String name;
		private String sex;
		private Integer age;

		public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
	}

		public String getSex() {
		return sex;
	}

		public void setSex(String sex) {
		this.sex = sex;
	}

		public Integer getAge() {
		return age;
	}

		public void setAge(Integer age) {
		this.age = age;
	}

		@Override
		public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				'}';
	}

}
