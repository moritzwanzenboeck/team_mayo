package test_1;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class NormalDrive  extends Thread{
		public void run() {
			
//			RegulatedMotor motorA = new EV3MediumRegulatedMotor(MotorPort.A);
//		    RegulatedMotor motorB = new EV3MediumRegulatedMotor(MotorPort.B);
//
			while (true) {
		    	  if(Variables.button_pressed == true) {
		    		  
//			    	  motorA.setSpeed(Variables.getSpeed());
//				      motorB.setSpeed(Variables.getSpeed());
//				      motorA.forward();
//				      motorB.backward();
//				      Delay.msDelay(15000);
//				      motorA.stop();
//				      motorB.stop();
//				      Variables.button_pressed = false;
//			    		
		    		  Variables.setSpeed(300);
		    		  Variables.button_pressed = false;

		    		  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
		    		  Variables.setSpeed(250);
	    	}
		}
	}
}

