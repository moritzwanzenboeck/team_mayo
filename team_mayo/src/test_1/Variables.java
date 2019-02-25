package test_1;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Variables {

	// Status des Touch-Sensors

	public static boolean button_pressed = false;
	
	// Halt-Wert
	
	public static boolean stop = false;

	// Standartgeschwindigkeit der Motoren

	private static int speed = 250;

	// Zwischenzeiten

	public static long Timer1 = 0;
	public static long Timer2 = 0;

	// Motoren
	// Motor A & B groﬂ: 	Fortbewegung
	// Motor C klein: 		Schaufel

	public static RegulatedMotor motorA = new EV3MediumRegulatedMotor(MotorPort.A);
	public static RegulatedMotor motorB = new EV3MediumRegulatedMotor(MotorPort.B);

	public static RegulatedMotor motorC = new EV3MediumRegulatedMotor(MotorPort.C);

	// Getter-Setter-Methode

	public static int getSpeed() {
		return speed;
	}

	public static void setSpeed(int speed) {
		Variables.speed = speed;
	}

}
