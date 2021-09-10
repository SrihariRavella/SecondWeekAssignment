package com.pinball.Machines;

import java.util.Scanner;

public class PinBallMachineFactoryMainFactory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			System.out.println("**** PinBall Machine Factory ****");
			System.out.println("Types of PinBall Machines");
			System.out.println("1. Physical PinBall Machine");
			System.out.println("2. Digital PinBall Machine");
			System.out.println("Select your choice :");
			String option = sc.next();
			if("1".equals(option) || "2".equals(option)) {
				flag = true;
				PinBallFactory o = new PinBallFactory();
				o.getPinBallMachine(option);	
			}else {
				System.out.println("Selected Option is not proper");
				flag = false;
			}
		}while(!flag);
	}

}
