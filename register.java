import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class register extends JFrame {
	JLabel ul;
	JTextField uf;

	register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setTitle("Register");
		// setLayout(new FlowLayout());
		ul = new JLabel("user");
		uf = new JTextField(15);

		add(ul);
		add(uf);

		setVisible(true);
	}

	public static void main(String args[]) {
		register r = new register();
	}
}