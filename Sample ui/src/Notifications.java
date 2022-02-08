import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Notifications extends JPanel {

	/**
	 * Create the panel.
	 */
	public Notifications() {
		setBackground(Color.GRAY);
		setSize(461,539);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Notifications");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(151, 34, 134, 60);
		add(lblNewLabel);

	}

}
