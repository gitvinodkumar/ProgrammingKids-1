package com.nt.beans;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("wish")
public class WhishMessageGenerator {
	
	@Resource(name="dt")
	 Date date;
	@Override
	public String toString() {
		return "WhishMessageGenerator [date=" + date + "]";
	}
	public String generateWishMessage(String name){
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12){
			return "good marng"+name;
		}else{
			return "goodAfternoon"+name;
		}
	}
	
	

}
