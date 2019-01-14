package test_1;


import java.awt.event.*;
import java.util.EventListener;


import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Test1 {
	public static void main(String args[]) {
		
		MultithreadingTest mtt = new MultithreadingTest();
		mtt.start();
		
	      RegulatedMotor motorA = new EV3MediumRegulatedMotor(MotorPort.A);
	      RegulatedMotor motorB = new EV3MediumRegulatedMotor(MotorPort.B);
	      //SensorModes sensor = new EV3TouchSensor(port);
	      //SampleProvider touch = sensor.getMode("Touch");
	      
	      	      
	      
	      motorA.setSpeed(250);
	      motorB.setSpeed(250);
	      motorA.forward();
	      motorB.forward();
	      Delay.msDelay(5000);
	      motorA.stop();
	      motorB.stop();
	      

	      if(Variables.button_pressed == true) {
	    	  motorA.setSpeed(250);
		      motorB.setSpeed(250);
		      motorA.forward();
		      motorB.forward();
		      Delay.msDelay(5000);
		      motorA.stop();
		      motorB.stop();
		      Variables.button_pressed = false;

	      }
	      
	      motorA.close();
	      motorB.close();

	      
	}
	

} 


