package com.wenger.test;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.wenger.demo.UserService;

public class test {
	@Test
	public void userTest(){
		//获取spring配置文件(获取工厂)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过工厂获取bean
		UserService user = (UserService) context.getBean("us");
		user.sayHello();
	}
	@Test
	public void userTest1(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		UserService service  = (UserService) beanFactory.getBean("us");
		service.sayHello();
	}
}
