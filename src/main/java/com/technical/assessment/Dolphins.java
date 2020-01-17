package com.technical.assessment;

public class Dolphins extends Animal{

	//Static Attributes
	///////////////////
	private static final long serialVersionUID = -6471353311492207213L;
	
	//Composition
	//////////////
	private Fish fish = new Fish();
	
	//Override Methods
	/////////////////
	@Override
	public boolean sing() {
		return fish.sing();		
	}

	@Override
	public boolean walk() {
		return fish.walk();		
	}

	@Override
	public boolean fly() {
		return fish.fly();		
	}

	@Override
	public boolean swim() {
		return fish.swim();		
	}

}
