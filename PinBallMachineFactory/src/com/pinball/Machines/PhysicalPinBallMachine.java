package com.pinball.Machines;


public class PhysicalPinBallMachine extends PinBallMachine{

	public PhysicalPinBallMachine(String pinBall, String dimensions, String flippers, String score) {
		super(pinBall, dimensions, flippers, score);
	}
	
	PhysicalPinBallMachine(){
		this("pinBall","20*30*20","2flippers","max 100");
	}

	@Override
	public PhysicalPinBallMachine createPinBallMachine() {
		System.out.println("starting pinBall Creation");
		PhysicalPinBallMachine pinball = new PhysicalPinBallMachine();
		
		pinball.Requirements();
		pinball.construction();
		pinball.assemblance();
		pinball.Testing();
		return pinball;
	}
	
	public void displayResult() {
		System.out.println("created PhysicalPinBallMachine ");
	}

}