package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Bike;
import com.nt.beans.Pulsor;
import com.nt.cnfgs.AppConfig;

public class InnerBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		
		//create ioc container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get bean method from 
		Bike b=ctx.getBean("pulsor",Pulsor.class);
		
		System.out.println(b);

	}

}
