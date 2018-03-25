//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Set;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Bb = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0 ; i < 5 ; i++) {
		String color = JOptionPane.showInputDialog("waht color");
		//5. Use an if/else statement to set the pen color that the user requested
			Bb.penDown();
					if ( color.equals("red")) {
					Bb.setPenColor(255, 0, 0);
					}
					else if ( color.equals("orange")) {
						Bb.setPenColor(222, 115, 0);
					}
					else if ( color.equals("green")) {
						Bb.setPenColor(68, 242, 81);
					}
					else if ( color.equals("yellow")) {
						Bb.setPenColor(250, 218, 7);
					}
					else if ( color.equals("blue")) {
						Bb.setPenColor(32, 145, 246);
					}
					else if ( color.equals("puple")) {
						Bb.setPenColor(160, 63, 246);
					}
					else if ( color.equals("black")) {
						Bb.setPenColor(0, 0, 0);
					}
        //6. If the user doesn’t enter anything, choose a random color
					else {
						Bb.setRandomPenColor();
					}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
					Bb.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
					for (int a = 0; a < 4 ; a++) {
						Bb.setSpeed(10000);
					Bb.move(200);
					Bb.turn(90);
					}
	}
	}
}
