package com.basics.methodreferences;

import java.time.LocalDate;

public class Project {

	public static void projectProgress() {
		
	System.out.println("Project is making progress");
	
	LocalDate now = LocalDate.now();
	System.out.println("Date:" + now.toString());
	
	}
	
	public static void ThreadTask() {
		for(int i=1;i <=10;i++) {
			System.out.println(i*2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	}
	
	public static void oddto100() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println (i + " is the Odd numbers");
			}
		}
		
			
		}
	

}
