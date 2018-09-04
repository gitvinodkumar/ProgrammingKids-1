package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Bike;
import com.nt.cnfgs.AppConfig;

public class InnerBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		//create springboot run
		ctx=SpringApplication.run(AppConfig.class, args);
		//get bean method from 
		Bike b=ctx.getBean("bike",Bike.class);
		
		System.out.println(b);
		System.out.println(ctx);
		

	}

}
