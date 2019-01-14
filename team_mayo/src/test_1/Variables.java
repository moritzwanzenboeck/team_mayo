package test_1;

public class Variables {
	
	public static boolean button_pressed = false;
	private static int speed = 250;
	private static int timer = 0;
	
	
	public static int getSpeed() {
		return speed;
	}
	public static void setSpeed(int speed) {
		Variables.speed = speed;
	}
	public static int getTimer() {
		return timer;
	}
	public static void setTimer(int timer) {
		Variables.timer = timer;
	}

}
