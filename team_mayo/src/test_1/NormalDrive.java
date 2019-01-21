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
		    		  
		    		  Variables.setTimer2(System.currentTimeMillis());
		    		  if(Variables.getTimer1() + 250 > Variables.getTimer2()) {
		    			  
		    			  
		    			  System.out.println("Test");
//		    			  Variables.setTimer1(Variables.getTimer2());
		    			  		    		  }
		    		  else {
//		    			  Variables.setSpeed(300);
			    		  System.out.println("test1");


			    		  try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						}

		    		  }
//			    	  motorA.setSpeed(Variables.getSpeed());
//				      motorB.setSpeed(Variables.getSpeed());
//				      motorA.forward();
//				      motorB.backward();
//				      Delay.msDelay(15000);
//				      motorA.stop();
//				      motorB.stop();
//				      Variables.button_pressed = false;
		    		  System.out.println(Variables.getTimer2() - Variables.getTimer1());
		    		  Variables.setTimer1(Variables.getTimer2());
		    		  Variables.setSpeed(250);
		    		  Variables.button_pressed = false;
		    		  
		    		  
	    	}
		}
	}
}

