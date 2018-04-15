
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot Bb = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		Bb.miniaturize();
		Bb.setSpeed(100);
		Bb.hide();
		Bb.turn(270);
		Bb.move(400);
		Bb.show();
		Bb.setPenColor(0, 127, 12);
		Bb.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
		for(int b = 0; b < 5 ; b ++) {
		for(int i = 0; i < 5 ; i ++) {
			Bb.move(30);
			Bb.turn(144);
			
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */
		Bb.penUp();
		Bb.turn(180);
		Bb.move(50);
		Bb.penDown();
		Bb.turn(180);
		}
	}

}
