import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Project extends JPanel {

	/**
	 * Create the panel.
	 */
	public Project() {
		setBackground(Color.GRAY);
		setSize(461,539);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current Project Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(102, 35, 251, 58);
		add(lblNewLabel);

	}

}
