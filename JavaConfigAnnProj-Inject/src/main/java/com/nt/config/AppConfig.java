package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Address;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	
	
	@Bean(name="ad")
	public Address getObject(){
		
		
		return new Address();
	}

}
