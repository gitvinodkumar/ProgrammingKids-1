package com.nt.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.WhishMessageGenerator;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class Test {
	
	public static void main(String[] args) {
ApplicationContext ctx=null;
		
		//create ioc container
		
		ctx=SpringApplication.run(Test.class, args);
		WhishMessageGenerator g=ctx.getBean("wish",WhishMessageGenerator.class);
		System.out.println(g.generateWishMessage("raja"));
}
}
