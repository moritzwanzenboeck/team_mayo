package test_1;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorMode;

public class TouchTest {
	
	public static void main(String[] args) {
		EV3TouchSensor ts = new EV3TouchSensor(SensorPort.S1);
        SensorMode touch = ts.getTouchMode();
        float[] sample = new float[touch.sampleSize()];
 
        while (true) {
            ts.fetchSample(sample, 0);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            if (sample[0] == 1)
                System.out.println("pressed");
        }
	}
}
