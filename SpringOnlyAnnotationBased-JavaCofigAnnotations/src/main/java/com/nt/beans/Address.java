package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("hyd")
	private String city;
	@Value("517512")
	private String pincode;
	@Value("krishnapuram")
	private String villname;
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public void setVillname(String villname) {
		this.villname = villname;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", villname=" + villname + "]";
	}
	

}
