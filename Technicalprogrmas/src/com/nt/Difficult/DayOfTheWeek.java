package com.nt.Difficult;

import java.util.Date;

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		
		
		Date d=new Date(5,9,30);
		
		System.out.println(d);
		String date=String.valueOf(d);
		System.out.println(date.substring(0,3)+"day");
		
		
	}

}
