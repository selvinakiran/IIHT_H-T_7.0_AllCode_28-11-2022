package com.basics.methodreferences;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method refernce Demo");
		
		IWork iWork = Project::projectProgress;
		IWork iWork1 = Project::ThreadTask;  //this code also works for thread
		
		IWork iWork2 = Project::oddto100; 
		
		//iWork.doProject();
		//iWork1.doProject();
		iWork2.doProject();
		
//		Runnable runnable = Project::ThreadTask;
//		
//		Thread t1 = new Thread(runnable);
//		t1.start();
//		
		
		

	}

}
