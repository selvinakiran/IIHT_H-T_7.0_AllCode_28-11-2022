package com.basics.Interfaces;

public class Vehicles {
	
	public static void main(String args[])
	{
		Drivable D1 = new car();
		Drivable D2 = new auto();
		Drivable D3 = new bike();
		D1.driven();
		D2.driven();
		D3.driven();
	}
	
}


	class car implements Drivable{
	
	@Override
	public void driven() {
		System.out.println("the car can be drived");
	}
	}
	
	class auto implements Drivable{
		
		@Override
		public void driven() {
			System.out.println("the auto can be drived");
		}
	}
		class bike implements Drivable{
			
			@Override
			public void driven() {
				System.out.println("the bike can be drived");
			}
		}
