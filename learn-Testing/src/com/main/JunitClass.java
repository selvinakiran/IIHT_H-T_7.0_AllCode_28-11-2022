package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitClass {
	
	
	String Username="Selvina";
	@Test
	public void testUsername()
	{
		System.out.println("Test idf username matches");
		assertEquals("Selvina", Username);
	}

	//Sample one
	@Test
	public void JunitMethod()
	{
		System.out.println("Test is executed");
	}

	public static void main(String[] args) {
		
		JunitClass results = new JunitClass();
		results.testUsername();
		
	}

}
