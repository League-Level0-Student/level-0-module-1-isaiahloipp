import javax.swing.JOptionPane;

public class secret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "chicken";

		String secretMessage = JOptionPane.showInputDialog(null, "what is the secret?");

		String passcode = JOptionPane.showInputDialog(null,
				"They can only see the secret message if they only guess the passcode");

		if (passcode.equals(password)) {

			JOptionPane.showMessageDialog(null, "The secret is " + secretMessage);

		}else {
			JOptionPane.showMessageDialog(null,"INTRUDER");
		}
	}
}
