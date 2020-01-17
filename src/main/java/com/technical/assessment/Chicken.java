package com.technical.assessment;

public class Chicken extends Birds {
	
	// Static Attributes
	////////////////////
	private static final long serialVersionUID = -3685259920345464696L;

	///Constructor
	//////////////
	public Chicken() {
		
	}
	
	public Chicken(String say) {
		super(say);
	}

	@Override
	public boolean fly() {
		 System.out.println("I Cannot Fly.!"); 		
		 return false;
	}
}
