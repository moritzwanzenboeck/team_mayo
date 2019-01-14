package test_1;

public class Variables {
	
	public static boolean button_pressed = false;
	private static int speed = 250;
	private static long Timer = 0;
	
	
	public static int getSpeed() {
		return speed;
	}
	public static void setSpeed(int speed) {
		Variables.speed = speed;
	}
	public static long getTimer() {
		return Timer;
	}
	public static void setTimer(long timer) {
		Timer = timer;
	}
	
}
