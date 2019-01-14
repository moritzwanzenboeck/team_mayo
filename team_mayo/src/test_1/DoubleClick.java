package test_1;

import java.util.Timer;

public class DoubleClick extends Thread{
	public void run() {
	
		while(true) {
			if(Variables.button_pressed == true ) {
				for(int i=0; i < 10; i++ ) {
					try {
						Thread.sleep(100);
						Variables.setTimer(Variables.getTimer()+1);
						System.out.println(Variables.getTimer());
					} catch (InterruptedException e) {
					}
					
				}
				Variables.setTimer(0);
				
			}
		}
	}
}
