package com.nt.cnfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.nt.beans.Address;

@Configuration
@ComponentScan(basePackages={"com.nt.beans","com.nt.address"})
public class AppConfig {
	
	
	@Bean(name="add")
	@DependsOn("ss")
	public Address getObject(){
		
		return new Address();
	}

}
