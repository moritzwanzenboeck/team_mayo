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
		NormalDrive nd = new NormalDrive();
		nd.start();
		DoubleClick dc = new DoubleClick();
		dc.start();
		
		
	      RegulatedMotor motorA = new EV3MediumRegulatedMotor(MotorPort.A);
	      RegulatedMotor motorB = new EV3MediumRegulatedMotor(MotorPort.B);
	      //SensorModes sensor = new EV3TouchSensor(port);
	      //SampleProvider touch = sensor.getMode("Touch");
	      
	      	      
	      while(true) {
	    	  motorA.setSpeed(Variables.getSpeed());
		      motorB.setSpeed(Variables.getSpeed());
		      motorA.forward();
		      motorB.forward();
		      
	      }
	      
	      	      	      
	      
	      

		}	      
	      	      
	      
	      
	      
	}
	




