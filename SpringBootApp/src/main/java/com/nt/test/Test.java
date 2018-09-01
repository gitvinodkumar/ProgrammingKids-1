package com.nt.test;


import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.WhishMessageGenerator;
import com.nt.config.AppConfig;

//@SpringBootApplication
@Import(value=AppConfig.class)
public class Test {
	
 

	public static void main(String[] args) {
ApplicationContext ctx=null;
		BeanFactory factory=null;
		//create ioc container
		
		ctx=SpringApplication.run(Test.class, args);
	
		WhishMessageGenerator g=ctx.getBean("wish",WhishMessageGenerator.class);
		System.out.println(g.generateWishMessage("raja"));
		System.out.println(g.toString());
		
}
}
