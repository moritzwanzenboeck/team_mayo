package test_1;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorMode;

public class MultithreadingTest2 extends Thread {

	public void run() {

		EV3TouchSensor ts = new EV3TouchSensor(SensorPort.S1);
		SensorMode touch = ts.getTouchMode();
		float[] sample = new float[touch.sampleSize()];

		while (true) {
			ts.fetchSample(sample, 0);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
			if (sample[0] == 1) {
				if (!Variables.button_pressed) {
					Variables.button_pressed = true;
					Variables.Timer1 = System.currentTimeMillis();

					System.out.println(Variables.press_counter);
				} 
			}
			
			else {
				
				if(Variables.button_pressed == true) {
					
					Variables.Timer2 = System.currentTimeMillis();
					System.out.println(Variables.Timer2-Variables.Timer1);

				if (Variables.Timer2 - Variables.Timer1 < 500) {
					Variables.motorA.stop();
					Variables.motorB.stop();
					Variables.motorC.forward();
					Variables.motorC.setSpeed(Variables.getSpeed()/10);
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e) {

					}
					
					Variables.motorC.stop();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
					Variables.motorC.backward();
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e) {

					}
					Variables.motorC.stop();
					Variables.motorA.setSpeed(250);
					Variables.motorB.setSpeed(250);
					Variables.motorA.forward();
					Variables.motorB.forward();

				}

				else {
					if (true) {
						Variables.motorA.setSpeed(25);
						Variables.motorB.setSpeed(25);
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {

						}
						Variables.motorA.setSpeed(250);
						Variables.motorB.setSpeed(250);

					}
				}
				Variables.button_pressed = false;
			}

		}
	}

	}
}
