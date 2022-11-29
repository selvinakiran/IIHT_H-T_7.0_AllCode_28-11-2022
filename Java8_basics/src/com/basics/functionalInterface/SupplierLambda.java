package com.basics.functionalInterface;

import java.util.function.Supplier;

public class SupplierLambda {
	
	static String product = "Android";
	public static void main(String[] args) { 
		
		 
        Supplier<Boolean> boolSupplier = () -> product.length() == 10;
        Supplier<Integer> intSupplier = () -> product.length() - 2;
        Supplier<String> supplier = () -> product.toUpperCase();
        
        
        System.out.println(boolSupplier.get());//false
        System.out.println(intSupplier.get());//5
        System.out.println(supplier.get());//ANDROID
	}
}