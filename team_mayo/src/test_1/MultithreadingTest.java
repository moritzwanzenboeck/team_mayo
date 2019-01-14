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
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            if (sample[0] == 1 && !Variables.button_pressed) {
                System.out.println("pressed");
                Variables.button_pressed = true;
            }
        }
	}

	
	}	
	


