import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.ImageIcon;

public class Acc_Info extends JPanel {

	/**
	 * Create the panel.
	 */
	public Acc_Info() {
		setBackground(Color.GRAY);
		setSize(461,539);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sample Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(48, 236, 195, 43);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(48, 289, 195, 53);
		add(lblNewLabel_1);

	}
}
