package com.technical.assessment;

import com.technical.assessment.common.interfaces.Swim;

public class Duck extends Birds implements Swim {


	// Static Attributes
	////////////////////
	private static final long serialVersionUID = 8313193755555476733L;

	///Constructor
	//////////////
	public Duck() {
		
	}
	
	public Duck(String say) {
		super(say);
	}

	@Override
	public boolean swim() {
		 System.out.println("I can Swim"); 	
		 return true;
	}

}
