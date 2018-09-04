package com.nt.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike {
	
	@Resource(name="pulsor")
	Pulsor pulsor;
	
	

	public Bike(){
		System.out.println("Bike.constructor()");
	}
	@Override
	public String toString() {
		return "Bike [pulsor=" + pulsor + "]";
	}

}
