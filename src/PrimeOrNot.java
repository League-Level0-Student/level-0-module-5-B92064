import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[]args) {
	String s = JOptionPane.showInputDialog("Give me a number to see if it is prime (No Decimals)");
	int prime1 = Integer.parseInt(s);
	for(int i = 2; i <= prime1; i++) {
		if(prime1 %2 == 0) {
			JOptionPane.showMessageDialog(null, "Not a Prime Number");
			System.exit(0);
		}
		if(prime1 %3 == 0) {
			JOptionPane.showMessageDialog(null, "Not a Prime Number");
			System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "It's a prime number");
}
}
