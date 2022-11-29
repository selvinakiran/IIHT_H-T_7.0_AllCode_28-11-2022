package com.basics.Lambda;

interface Sayhello
{
	public void hello();
}

public class LearnLambda {

	public static void main(String[] args) {
		
		
		
		
	// Using  Interface in Lambda expression
		
		
		Sayhello h2= () -> System.out.println("Selvina");  //Single statement cury braces is not needed
	
		h2.hello();
		
	
		
		LearnLambda learn = new LearnLambda();
		
		MathOperation add = (Integer num1, Integer num2) -> num1 + num2;
		
		MathOperation sub = (Integer num1, Integer num2) -> num1 - num2;
		
		MathOperation multi = (Integer num1, Integer num2) -> num1 *  num2;
		
		MathOperation div  = (Integer num1, Integer num2) -> num1 / num2;
		
		System.out.println("Addition"+learn.operate(100,100, add));
		System.out.println("Subtraction"+learn.operate(100,100, sub));
		System.out.println("Multiplication"+learn.operate(100,100, multi));
		System.out.println("Division"+learn.operate(100,100, div));
	
	}
	
	private Integer operate(Integer num1,Integer num2 ,MathOperation mathoperation)
	{
		return mathoperation.operation(num1, num2);
	}

}
