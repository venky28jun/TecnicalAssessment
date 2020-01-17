package com.technical.assessment;

import com.technical.assessment.common.interfaces.Say;

public class Birds extends Animal implements Say {
	
	// Static Attributes
	////////////////////
	private static final long serialVersionUID = 998258453230836366L;
	
	// Attributes
	////////////
	private String say;
	
	//Constructor
	/////////////
	public Birds() {
		
	}
	
	public Birds(String say) {
		super();
		this.say = say;
	}

	//Properties
	/////////////
	public String getSay() {
		return say;
	}


	public void setSay(String say) {
		this.say = say;
	}
	
	//Override Methods
	//////////////////
	@Override
	public String toString() {
		return "Birds [say=" + say + "]";
	}

	@Override
	public boolean sing() {
		System.out.println("I am Singing"); 	
		return true;
	}

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public void say() {
		System.out.println(this.say); 		
	}

	@Override
	public boolean swim() {
		System.out.println("I cannot swim"); 
		return false;
	}

	@Override
	public boolean fly() {
		System.out.println("I am flying"); 		
		return true;
	}

}
