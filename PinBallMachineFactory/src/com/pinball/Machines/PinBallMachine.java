package com.pinball.Machines;

public abstract class PinBallMachine {
	
	private String pinBall;
	private String dimensions;
	private String flippers;
	private String score;
	

	public PinBallMachine(String pinBall, String dimensions, String flippers, String score) {
		super();
		this.pinBall = pinBall;
		this.dimensions = dimensions;
		this.flippers = flippers;
		this.score = score;
	}
	
	
	public void Requirements() {
		System.out.println("Check the requirements as per order");
	}
	public void construction() {
		System.out.println("Set Up the working gamePad");
	}
	public void assemblance() {
		System.out.println("Combine all the parts together and set up the game play");
	}
	public void Testing() {
		System.out.println("Check the game play functionalities");
	}
	
	public abstract PinBallMachine createPinBallMachine();


	@Override
	public String toString() {
		return "PinBallMachine [pinBall=" + pinBall + ", dimensions=" + dimensions + ", flippers=" + flippers
				+ ", score=" + score + "]";
	}
	
}
