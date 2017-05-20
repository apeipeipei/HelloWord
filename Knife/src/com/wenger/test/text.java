package com.wenger.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wenger.demo.UserService;

public class text {
	@Test
	public void userText(){
		//获取spring配置文件(获取工厂)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过工厂获取bean
		UserService user = (UserService) context.getBean("us");
		user.sayHello();
	}
}
