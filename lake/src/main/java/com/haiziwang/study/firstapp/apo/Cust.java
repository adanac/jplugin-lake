package com.haiziwang.study.firstapp.apo;

/**
 * 
 * 这个Package里面定义不会映射到数据库表结构的应用程序JavaBean，一般在应用对外的服务中可能用到。
 * 
 * @author Administrator
 *
 */

public class Cust {
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
