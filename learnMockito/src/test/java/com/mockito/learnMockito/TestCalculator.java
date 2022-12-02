package com.mockito.learnMockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestCalculator{
	Calculator c = null;
	
	IcalculatorService service = Mockito.mock(IcalculatorService.class);

	@Before
	public void setup() {
		c = new Calculator(service);
	}
	
	@Test
	public void perform() {
		when(service.add(60, 60)).thenReturn(120);
		assertEquals(120, c.performAdd(60, 60));
		
		when(service.sub(60, 60)).thenReturn(0);
		assertEquals(0, c.performSub(60, 60));
		
		when(service.multiply(10, 10)).thenReturn(100);
		assertEquals(100, c.performMulti(10, 10));
		
	}

	
	//commented for testing other cases
//	@Test
//	public void testAdd() {
//		assertEquals(120, c.add(60, 60));
//		
//	}
//
//	@Test
//	public void tesSub() {
//		assertEquals(0, c.sub(60, 60));
//		
//	}
//	
//	@Test
//	public void tesmulti() {
//		assertEquals(100, c.multiply(10, 10));
//		
//	}
	
	
	
	//Refernce purpose no use 
//	IcalculatorService service = new IcalculatorService() {
//		public int add(int num1,int num2) {
//			return 0;
//		}
//		public int sub(int num1,int num2) {
//			return 0;
//		}
//		public int multiply(int num1,int num2) {
//			return 0;
//		}
//	};
	

}
