package com.mockito.learnMockito;

public class Calculator {
	
	IcalculatorService service;
	
	public Calculator(IcalculatorService service )
	{
		this.service= service;
	}
	
	public int add(int num1,int num2) {
		return num1 + num2;
		
	}
	public int sub(int num1,int num2) {
		return num1 - num2;
		
	}
	public int multiply(int num1,int num2) {
		return num1 * num2;
		
	}
	
	public int performAdd(int num1,int num2) {
		return (num1 + num2);
		
	}
	
	public int performSub(int num1,int num2) {
		return (num1 - num2);
		
	}
	public int performMulti(int num1,int num2) {
		return (num1 * num2);
		
	}

}
