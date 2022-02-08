import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Notes extends JPanel {

	/**
	 * Create the panel.
	 */
	public Notes() {
		setBackground(Color.GRAY);
		setSize(461,539);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Notes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(163, 30, 134, 60);
		add(lblNewLabel);


	}

}
