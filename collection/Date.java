package com.collection;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;


public class Date {
	
	public static void main(String[] args) {
		
//		LocalDate date = LocalDate.of(2020, 12, 8);
//		
//		int a=date.getMonthValue();
//		System.out.println(date.getMonth());
//		System.out.println(date.getMonthValue());
		
	///	System.out.println(date);
		
		  Date date2=new Date();
	        Calendar c = Calendar.getInstance();
	     //   c.setTimeZone(date2);
	        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	        System.out.println("Day of week in number:"+dayOfWeek);
	        String dayWeekText = new SimpleDateFormat("EEEE").format(date2);
	        System.out.println("Day of week in text:"+dayWeekText);

		   
	}

}
