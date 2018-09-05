package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Books;
import com.nt.cnfgs.AppConfig;

public class Test {
	
	
	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		//by using anntation
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get bean method
		Books b=ctx.getBean("boo",Books.class);
		
		System.out.println(b);
	
	}

}
