package com.nt.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Example;
import com.nt.beans.Sample;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	
	@Bean
	public Date getObject(){
		
		return new Date();
	}
	
	@Bean(name="e")
	public Example getObj(){
		return new Example();
	}
	@Bean(name="s")
	
	public Sample getObje(){
		return new Sample();
	}

}
