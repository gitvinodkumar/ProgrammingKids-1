package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentService;
import com.nt.service.StudentServiceImpl;

public class StudentTest {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		//get beean methdo
		StudentService service=ctx.getBean("stService",StudentServiceImpl.class);
		//acess that service
		System.out.println(service.Register(346, "hari", "teacher"));
		System.out.println(service.GetDetails(345));
		System.out.println(service.getUpdate("manager",345));
		System.out.println();
		System.out.println();
		System.out.println(service.getAllStudents());
		System.out.println();
		System.out.println(service.StudentDelete(345));
	}

}
