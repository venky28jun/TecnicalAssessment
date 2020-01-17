package com.technical.assessment;

public class Parrot extends Birds {

	//Static Attributes
	///////////////////
	private static final long serialVersionUID = -2453542672981106971L;
	
	private String parrotAddress;
	
	///Constructor
	//////////////
	public Parrot() {
		
	}
	
	public Parrot(String parrotAddress,String say) {
		super(parrotAddress + " : " + say);
		this.parrotAddress = parrotAddress;
	}

	@Override
	public String toString() {
		return "Parrot [parrotAddress=" + parrotAddress + "]";
	}

	//Properties
	/////////////
	public String getParrotAddress() {
		return parrotAddress;
	}

	public void setParrotAddress(String parrotAddress) {
		this.parrotAddress = parrotAddress;
	}

}
