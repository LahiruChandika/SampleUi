import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class QRcode extends JPanel {

	/**
	 * Create the panel.
	 */
	public QRcode() {
		setBackground(Color.GRAY);
		setSize(461,539);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QR Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(165, 35, 134, 60);
		add(lblNewLabel);


	}

}
