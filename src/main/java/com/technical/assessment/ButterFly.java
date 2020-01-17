package com.technical.assessment;

public class ButterFly extends Animal {

	// Static Attributes
	//////////////
	private static final long serialVersionUID = -3991290847926590119L;

	private final STAGE stage;

	public enum STAGE {
		BUTTERFLY, CATERPILLAR
	}

	public ButterFly(STAGE stage) {
		this.stage = stage;
	}

	public STAGE getStage() {
		return stage;
	}

	// Composition
	//////////////
	private Birds bird = new Birds();

	// Properties
	////////////
	@Override
	public boolean sing() {
		System.out.println("I cannot make sound");
		return false;

	}

	@Override
	public boolean walk() {
		if(this.stage.equals(STAGE.BUTTERFLY)) {
			System.out.println("I cannot walk");
			return false;
		}else {
			bird.walk();
			return true;
		}
		
	}

	@Override
	public boolean fly() {
		if(this.stage.equals(STAGE.BUTTERFLY)) {
			return bird.fly();
		}else {
			System.out.println("I cannot Fly.!");
			return false;
		}
	}

	@Override
	public boolean swim() {
		System.out.println("I cannot swim");
		return false;
	}

}
