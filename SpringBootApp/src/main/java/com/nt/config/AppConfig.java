package com.nt.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ComponentScan(basePackages="com.nt.beans")
@ImportResource({"com/nt/cnfgs/applicationContext.xml"})
public class AppConfig {
	
	@Bean("dt")
	public Date createObject(){
		
		return new Date();
	}

}
