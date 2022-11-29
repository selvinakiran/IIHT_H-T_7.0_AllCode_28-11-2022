package com.basics.Interfaces;


interface addition{
	void add();
	static Integer Sq(Integer x)
	{
		return x+x;
	}
}

interface subtraction{
	void sub();
	static Integer Sq(Integer x)
	{
		return x-x;
	}
}

interface multiply{
	void multi();
	static Integer Sq(Integer x)
	{
		return x*x;
	}
}


interface divide{
	void div();
	static Integer Sq(Integer x)
	{
		return x/x;
	}
}



public class TestCalulate {

	public static void main(String[] args) {
		addition a1 = new addincall();
		subtraction a2 = new subincall();
		multiply a3 = new multiincall();
		divide a4 = new diviincall();
		a1.add();
		a2.sub();
		a3.multi();
		a4.div();
		System.out.println(addition.Sq(10));
		System.out.println(subtraction.Sq(10));
		System.out.println(multiply.Sq(10));
		System.out.println(divide.Sq(10));
	}

}


class addincall implements addition
{

	@Override
	public void add() {
	
	}		
}


class subincall implements subtraction
{

	@Override
	public void sub() {
	
	}		
}


class multiincall implements multiply
{

	@Override
	public void multi() {
	
	}		
}

class diviincall implements divide
{

	@Override
	public void div() {
	
	}		
}
