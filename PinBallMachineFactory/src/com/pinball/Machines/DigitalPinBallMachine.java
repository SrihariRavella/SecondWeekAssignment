package com.pinball.Machines;


public class DigitalPinBallMachine extends PinBallMachine{

	public DigitalPinBallMachine(String pinBall, String dimensions, String flippers, String score) {
		super(pinBall, dimensions, flippers, score);
	}
	
	DigitalPinBallMachine(){
		this("pinBall","30*30*30","2flippers","max 100");
	}

	@Override
	public DigitalPinBallMachine createPinBallMachine() {
		System.out.println("Creating Digital Pin Ball Machine");
		
		DigitalPinBallMachine pinball = new DigitalPinBallMachine();
		
		pinball.Requirements();
		pinball.construction();
		pinball.assemblance();
		pinball.Testing();
		
		return pinball;
	}
	
	public void displayResult() {
		System.out.println("created DigitalPinBallMachine ");
	}

}