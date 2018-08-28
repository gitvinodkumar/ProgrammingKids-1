package com.nt.test;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.Student;
import com.nt.config.AppConfig;

public class StudentTest {

	private static Logger logger=Logger.getLogger(StudentTest.class);
	public static void main(String[] args) {
		
		SimpleLayout layout=null;
		ConsoleAppender appender=null;
		
		//create layout
		layout=new SimpleLayout();
		//create Appender
		appender=new ConsoleAppender(layout);
		//add to appender
		logger.addAppender(appender);
		//set level of that 
		logger.setLevel(Level.ALL);
		logger.debug("start from main method");
		
		ApplicationContext ctx=null;
		logger.debug("create ioc conatner");
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		logger.debug("get bean method");
		Student ss=ctx.getBean("ss",Student.class);
		logger.debug("use that method of student");
		System.out.println(ss);
		
		logger.debug("close that ioc conatiner");
		((AbstractApplicationContext) ctx).close();

	}

}
