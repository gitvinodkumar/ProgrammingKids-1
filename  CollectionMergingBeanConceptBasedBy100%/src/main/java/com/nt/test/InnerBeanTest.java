package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bike;
import com.nt.beans.Pulsor;

public class InnerBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationConext.xml");
		
		//get bean method from 
		Bike b=ctx.getBean("pulsor",Pulsor.class);
		
		System.out.println(b);

	}

}
