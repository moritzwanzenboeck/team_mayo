package test_1;


import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Test1 {
	public static void main(String args[]) {
	      RegulatedMotor motorB = new EV3MediumRegulatedMotor(MotorPort.B);
	      RegulatedMotor motorC = new EV3MediumRegulatedMotor(MotorPort.C);
	      Port port = LocalEV3.get().getPort("S1");
	      SensorModes sensor = new EV3TouchSensor(port);
	      
	      
	      	      
	      
	      motorB.setSpeed(250);
	      motorC.setSpeed(250);
	      motorB.forward();
	      motorC.backward();
	      Delay.msDelay(5000);
	      motorB.stop();
	      motorC.stop();
	      
	      if(sensor.getAvailableModes()) {
	    	  motorB.forward();
		      motorC.backward();
		      Delay.msDelay(5000);
		      motorB.stop();
		      motorC.stop();
	      };
	      
	      
	      motorB.close();
	      motorC.close();
	      System.out.println("Test!icle");
	      
	}
}
