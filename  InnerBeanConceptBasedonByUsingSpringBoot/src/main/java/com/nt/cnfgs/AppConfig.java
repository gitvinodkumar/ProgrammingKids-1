package com.nt.cnfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Pulsor;

//@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	
	
	/*@Bean
	public Pulsor getObject(){
		
		return new Pulsor();
	}*/

}
