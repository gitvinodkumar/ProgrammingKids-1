package com.nt.test;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.address.Example;
import com.nt.beans.Student;
import com.nt.cnfgs.AppConfig;



public class StudentTest {
	private static final Logger logger=Logger.getLogger(StudentTest.class);
	public static void main(String[] args) {
		
		
		
			SimpleLayout layout=null;
			ConsoleAppender appender=null;
			
			//create Lqyout///////
			layout=new SimpleLayout();
			//create appender
			appender=new ConsoleAppender(layout);
			//appender is attachment to loger
			logger.addAppender(appender);
			//set activitis
			logger.setLevel(Level.ALL);
			logger.info("program is stared from main method");
			ApplicationContext ctx=null;
			
			logger.debug("create  annotationBased ioc container");
			//create ioc
			ctx=new AnnotationConfigApplicationContext(AppConfig.class);
			
			//get bean method
			Student s=ctx.getBean("ss",Student.class);
			Example e=ctx.getBean("ex",Example.class);
			logger.debug("using that method");
			System.out.println(s);
			logger.debug("example class message");
			System.out.println(e);
			

	}

}
