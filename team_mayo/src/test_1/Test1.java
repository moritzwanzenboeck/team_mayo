package test_1;


//import lejos.hardware.ev3.LocalEV3;
//import lejos.hardware.motor.EV3LargeRegulatedMotor;
//import lejos.hardware.motor.EV3MediumRegulatedMotor;
//import lejos.hardware.port.MotorPort;
//import lejos.hardware.port.Port;
//import lejos.hardware.port.SensorPort;
//import lejos.hardware.sensor.EV3TouchSensor;
//import lejos.hardware.sensor.SensorMode;
//import lejos.hardware.sensor.SensorModes;
//import lejos.robotics.RegulatedMotor;
//import lejos.robotics.SampleProvider;
//import lejos.utility.Delay;

public class Test1 {
	public static void main(String args[]) {
		
		MultithreadingTest2 mtt = new MultithreadingTest2();
		mtt.start();
//		NormalDrive nd = new NormalDrive();
//		nd.start();
//		DoubleClick dc = new DoubleClick();
//		dc.start();
		
		
	      
	      //SensorModes sensor = new EV3TouchSensor(port);
	      //SampleProvider touch = sensor.getMode("Touch");
		Variables.motorA.setSpeed(Variables.getSpeed());
		Variables.motorB.setSpeed(Variables.getSpeed());
		Variables.motorA.forward();
	    Variables.motorB.forward();

	      	      
	      while(true) {
	    	  try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
	    	  
		      		      
	      }
	      
	      	      	      
	      
	      

		}	      
	      	      
	      
	      
	      
	}
	




