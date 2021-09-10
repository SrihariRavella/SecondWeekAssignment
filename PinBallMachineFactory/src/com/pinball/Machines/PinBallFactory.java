package com.pinball.Machines;

public class PinBallFactory {
	
	public PinBallMachine getPinBallMachine(String option) {

		if("1".equals(option)) {
			PhysicalPinBallMachine physical = new PhysicalPinBallMachine().createPinBallMachine();
			System.out.println("created PhysicalPinBallMachine ");
			return physical;
		}else if("2".equals(option)) {
			DigitalPinBallMachine digital = new DigitalPinBallMachine().createPinBallMachine();
			System.out.println("created DigitalPinBallMachine ");
			return digital;
		}
		return null;
	}

}
