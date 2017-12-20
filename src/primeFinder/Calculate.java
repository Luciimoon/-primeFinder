package primeFinder;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Calculate {

	public void findPrime() {
		ArrayList<Integer> PrimeList = new ArrayList<Integer>();

		int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));

		for (int i = 2; i < 10; i++) {

			if ((num < 10) && (num > i) && (0 != num % i) || (num == 2)) {
				JOptionPane.showMessageDialog(null, num + " is a prime number");
				return;
			}

			if (0 == num % i) {

				for (i = 2; i < 10; i++) {
					if (0 == num % i)
						PrimeList.add(0, i);
					if (i == 9) {
						JOptionPane.showMessageDialog(null,
								num + " is not a prime number\n\n" + num + " is divisble by " + PrimeList);
						return;
					}
				}
			}
			if ((0 != num % i) && (i == 9)) {
				JOptionPane.showMessageDialog(null, num + " is a prime number");
				return;
			}
		}
	}

}
