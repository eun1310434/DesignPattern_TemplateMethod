package com.eun130434.designpattern.templatemethod;

public class Order {
	
	public static void main(String[] args){
		System.out.println("=================Customer A  order a Italian Sandwich.=================");
		SandwichCooking customer_a = new ItalianSandwichCooking();
		customer_a.makeSandwich();
		
		System.out.println();
		

		System.out.println("=================Customer B  order a Veggie Sandwich.=================");
		SandwichCooking customer_b = new VeggieSandwichCooking();
		customer_b.makeSandwich();
		
		System.out.println();
		

		System.out.println("=================Customer C  order a Korean Sandwich.=================");
		SandwichCooking customer_c = new KoreanSandwichCooking();
		customer_c.makeSandwich();
		
	}
	
}