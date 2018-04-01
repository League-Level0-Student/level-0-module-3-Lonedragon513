
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "7-22";
		String dadsBirthday = "10-4";
		String myBirthday = "12-12";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String hi = JOptionPane.showInputDialog("who's bristhday do you want s to know");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, hi);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (hi.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (hi.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (hi.equals("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {

			JOptionPane.showMessageDialog(null, "I know know that person's birsday");

		}
	}
}
