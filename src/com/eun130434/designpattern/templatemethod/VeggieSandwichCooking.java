package com.eun130434.designpattern.templatemethod;

public class VeggieSandwichCooking extends SandwichCooking{

	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	
	boolean customerWantsMeat() { return false; }
	boolean customerWantsCheese() { return false; }

	@Override
	public void addVegetables(){
		System.out.print(" + Vegetables : ");
		for (String vegetable : veggiesUsed){
			System.out.print(vegetable + " ");
		}
	}
	
	@Override
	public void addCondiments(){
		System.out.print(" + Condiments : ");
		for (String condiment : condimentsUsed){
			System.out.print(condiment + " ");
		}
	}
	
	
	
	@Override
	boolean CheckMeat() {return false;}
	
	@Override
	void addMeat() {}
	
	@Override
	boolean CheckCheese() {return false;}
	
	@Override
	void addCheese() {}
	
	
	
}