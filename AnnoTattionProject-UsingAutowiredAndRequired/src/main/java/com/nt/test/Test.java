package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Student;
import com.nt.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		//BeanFactory bb=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		// BeanFactory bb=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cnfgs/applicationContext.xml"));
	//	BeanFactory bb=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
	//ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
	//ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	//by using beanfactory
		
	BeanFactory bb=new AnnotationConfigApplicationContext(AppConfig.class);
	
		//get bean ethod
		Student ss=bb.getBean("ss",Student.class);
		
		System.out.println(ss);
		System.out.println(bb);
	
	}
	
}
