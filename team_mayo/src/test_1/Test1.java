package test_1;

public class Test1 {
	public static void main(String args[]) {

		// Start des Threads

		MultithreadingTest2 mtt = new MultithreadingTest2();
		mtt.start();

		Variables.motorA.setSpeed(Variables.getSpeed());
		Variables.motorB.setSpeed(Variables.getSpeed());
		Variables.motorA.backward();
		Variables.motorB.backward();

		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}

}
