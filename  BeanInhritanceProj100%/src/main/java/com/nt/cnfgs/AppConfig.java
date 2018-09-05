package com.nt.cnfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.nt.cnfgs1.AppConfig1;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
@Import(value=AppConfig1.class)
public class AppConfig {

}
