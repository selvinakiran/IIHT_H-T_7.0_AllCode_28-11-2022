package com.basics.dateandtime;

import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
public class DateTime {

	public static void main(String[] args) {
		//Date today = new Date();
		
		LocalDate today = LocalDate.now();
		
		LocalDate date = LocalDate.of(2022,8,15);
		
		LocalDate dateinword = LocalDate.of(2022,Month.AUGUST,15);
		
		System.out.println(today);
		System.out.println(date);
		
		System.out.println(dateinword);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalTime nows = LocalTime.now();
		System.out.println(nows);
		
		LocalTime t1 = LocalTime.now(ZoneId.of("CET"));
		System.out.println(t1);
		
		
		

	}

}
