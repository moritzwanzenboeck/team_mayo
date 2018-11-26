package test_1;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Test1 {
	public static void main(String args[]) {
	      RegulatedMotor motorB = new EV3MediumRegulatedMotor(MotorPort.B);
	      RegulatedMotor motorC = new EV3MediumRegulatedMotor(MotorPort.C);
	      
	      motorB.setSpeed(250);
	      motorC.setSpeed(250);
	      motorB.forward();
	      motorC.backward();
	      Delay.msDelay(5000);
	      motorB.stop();
	      motorB.close();
	      motorC.stop();
	      motorC.close();
	      System.out.println("Test!icle");
	}
}
