package test_1;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorMode;

public class MultithreadingTest extends Thread {

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
					Variables.press_counter = 1;
					Variables.motorA.setSpeed(0);
					Variables.motorB.setSpeed(0);
					Variables.button_pressed = false;
				} else {
					if (System.currentTimeMillis() < Variables.Timer1 + 300) {
						Variables.press_counter++;
						Variables.Timer1 = System.currentTimeMillis();
					}
				}
			}

		}
	}

}
