package com.basics.Interfaces;


interface squares{
	void square();
	static Integer Sq(Integer x)
	{
		return x*x;
	}
}

// In JAVA 8 YOU GET THE FEATURE TO ADD A BODY TO A INTERFACE METHOD 

public class Calculate {

	public static void main(String[] args) {
		squares s = new Squareof10();
		s.square();
		System.out.println(squares.Sq(10));
		

	}

}



class Squareof10 implements squares
{

	@Override
	public void square() {
		System.out.println("");
		
	}
	
}