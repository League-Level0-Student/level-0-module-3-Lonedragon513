package elseif;

import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {
		String Ans = JOptionPane.showInputDialog("are you happy");
		if (Ans.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");

		} else if (Ans.equals("no")) {
			String Anss = JOptionPane.showInputDialog("do you waht to be happy");
			if (Anss.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change sometiuong");
			}
			if (Anss.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
			}
		}
	}
}
