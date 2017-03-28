package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
       Robot bot = new Robot();
       bot.setPenColor(Color.cyan);
	    bot.penDown();
	    bot.setSpeed(100);
	   int sides = 34; 
for(int i = 0; i < sides; i++){
	    
	bot.move(10);
	bot.turn(360 / sides);
	}
	
}
}