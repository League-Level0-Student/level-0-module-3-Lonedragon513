package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Bb = new Robot();	
public static void main(String[] args) {
	
	String QWERTY = JOptionPane.showInputDialog("what shape");
	String QWERTYs = JOptionPane.showInputDialog("what color #1");
	int QWERTYst = Integer.parseInt(QWERTYs);
	String QWERTYsts = JOptionPane.showInputDialog("what color #2");
	int QWERTYss = Integer.parseInt(QWERTYsts);
	String QWERTYstst = JOptionPane.showInputDialog("what color #3");
	int QWERTYstsss = Integer.parseInt(QWERTYstst);
	Bb.setPenColor(QWERTYst,QWERTYss,QWERTYstsss);
	if (QWERTY.equals("cir")) {
		Cir();
	}if (QWERTY.equals("tri")) {
		Tir();
	}if (QWERTY.equals("squ")) {
	Squ();
	}
 
		
	}
static void Cir(){		
	
	
	Bb.penDown();
	Bb.setSpeed(100);
	for (int i = 0 ; i < 360; i++) {

		Bb.move(1);
		Bb.turn(1);
	}
}
static void Tir(){		
	
	Bb.setSpeed(100);
	Bb.penDown();
	Bb.move(130);
	Bb.turn(120);
	Bb.move(130);
	Bb.turn(120);
	Bb.move(130);
	Bb.turn(120);
}
static void Squ(){	
	
	Bb.setSpeed(100);
	Bb.penDown();
	Bb.move(130);
	Bb.turn(90);
	Bb.move(130);
	Bb.turn(90);
	Bb.move(130);
	Bb.turn(90);
	Bb.move(130);
	Bb.turn(90);
}
}
