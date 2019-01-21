package test_1;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Variables {
	
	public static boolean button_pressed = false;
	public static int press_counter = 0;
	private static int speed = 250;
	public static long Timer1 = 0;
	private static long Timer2 = 0;
	public static RegulatedMotor motorA = new EV3MediumRegulatedMotor(MotorPort.A);
    public static RegulatedMotor motorB = new EV3MediumRegulatedMotor(MotorPort.B);
	
	
	
	public static int getSpeed() {
		return speed;
	}
	public static void setSpeed(int speed) {
		Variables.speed = speed;
	}
	public static long getTimer2() {
		return Timer2;
	}
	public static void setTimer2(long timer2) {
		Timer2 = timer2;
	}
		
}
