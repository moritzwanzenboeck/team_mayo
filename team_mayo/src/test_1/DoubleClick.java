package test_1;

import java.util.Timer;

public class DoubleClick extends Thread{
	public void run() {
	
		while(true) {
			if(Variables.button_pressed == true ) {
				Variables.setTimer(System.currentTimeMillis());
				System.out.println(Variables.getTimer());
			}
		}
	}
}
