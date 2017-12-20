package primeFinder;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Primer {

	public static void main(String[] args) {
		String msg;
		boolean running = true;

		Calculate Prime = new Calculate();

		UIManager.put("OptionPane.background", new ColorUIResource(2, 144, 231));
		UIManager.put("Panel.background", new ColorUIResource(2, 144, 231));

		while (running) {

			Prime.findPrime();

			msg = "Do you want go again?";
			String goAgain = JOptionPane.showInputDialog(null, msg).toLowerCase();

			if (goAgain.equals("y") || (goAgain.equals("yes"))) {
				running = true;
			} else if (goAgain.equals("n") || (goAgain.equals("no"))) {
				running = false;
				msg = "Goodbye, see ya!";
				JOptionPane.showMessageDialog(null, msg);
			} else {
				msg = "Please try again";
				JOptionPane.showMessageDialog(null, msg);

			}
		}
	}
}
