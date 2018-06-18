package com.eun130434.designpattern.templatemethod;

public class ItalianSandwichCooking extends SandwichCooking{
	
	String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = { "Provolone" };
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	public void addMeat(){
		System.out.print(" + Meat : ");
		for (String meat : meatUsed){
			System.out.print(meat + " ");
		}		
	}

	@Override
	public void addCheese(){
		System.out.print(" + Cheese : ");
		for (String cheese : cheeseUsed){
			System.out.print(cheese + " ");
		}
	}

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
}