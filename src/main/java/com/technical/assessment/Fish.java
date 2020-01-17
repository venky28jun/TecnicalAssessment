package com.technical.assessment;

public class Fish extends Animal{

	// Static Attributes
	////////////////////
	private static final long serialVersionUID = 1826937806929958167L;
	
	// Attributes
	////////////////////
	private String fishName;
	private String color;
	private String size;
	private String comments;
	
	//Constructor
	/////////////
	public Fish() {
		
	}
	public Fish(String fishName,String color,String size,String comments) {
		this.fishName = fishName;
		this.color = color;
		this.size = size;
		this.comments = comments;
	}
	
	//Properties
	////////////
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

	//Override Methods
	//////////////////
	@Override
	public String toString() {
		return "Fish [fishName=\" + fishName + \",color=" + color + ", size=" + size + ", comments=" + comments + "]";
	}
	
	@Override
	public boolean sing() {
		System.out.println("I cannot sing");	
		return false;
	}

	@Override
	public boolean walk() {
		System.out.println("I cannot walk");
		return false;
	}

	@Override
	public boolean fly() {
		System.out.println("I cannot fly");		
		return false;
	}

	@Override
	public boolean swim() {
		System.out.println("I can swim");	
		return true;
	}

}
