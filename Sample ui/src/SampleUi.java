import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import java.awt.Component;
import javax.swing.Box;

public class SampleUi {

	private JFrame frame;
	
	
	private Acc_Info acc_Info;
	private Project project;
	private Notifications notifications;
	private Notes notes;
	private QRcode qrcode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SampleUi window = new SampleUi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SampleUi() {
		
		acc_Info = new Acc_Info();
		project = new Project();
		notifications = new Notifications();
		notes = new Notes();
		qrcode = new QRcode();
		
		initialize();
			
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(696, 618));
		frame.setBounds(100, 100, 696, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 52, 549);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAcc = new JButton("");
		btnAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBackground(Color.DARK_GRAY);
		panelMainContent.setBounds(51, 10, 461, 539);
		frame.getContentPane().add(panelMainContent);
		panelMainContent.setLayout(null);
		
		btnAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainContent.add(acc_Info);
				
				menuClicked(acc_Info);
			}
		});
		
		
		
		btnAcc.setIcon(new ImageIcon("C:\\Users\\lahir\\OneDrive\\Desktop\\ui\\black-24dp\\2x\\baseline_person_black_24dp.png"));
		btnAcc.setBounds(0, 10, 52, 52);
		panel.add(btnAcc);
		
		JButton btnProject = new JButton("");
		btnProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainContent.add(project);
				
				menuClicked(project);
			}
		});
		btnProject.setIcon(new ImageIcon("C:\\Users\\lahir\\OneDrive\\Desktop\\ui\\black-24dp\\2x\\baseline_menu_black_24dp.png"));
		btnProject.setBounds(0, 62, 52, 52);
		panel.add(btnProject);
		
		JButton btnNotice = new JButton("");
		btnNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainContent.add(notifications);
				
				menuClicked(notifications);
			}
		});
		btnNotice.setIcon(new ImageIcon("C:\\Users\\lahir\\OneDrive\\Desktop\\ui\\black-24dp\\2x\\baseline_campaign_black_24dp.png"));
		btnNotice.setBounds(0, 115, 52, 52);
		panel.add(btnNotice);
		
		JButton btnNote = new JButton("");
		btnNote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainContent.add(notes);
				
				menuClicked(notes);
			}
		});
		btnNote.setIcon(new ImageIcon("C:\\Users\\lahir\\OneDrive\\Desktop\\ui\\black-24dp\\2x\\baseline_note_add_black_24dp.png"));
		btnNote.setBounds(0, 169, 52, 52);
		panel.add(btnNote);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainContent.add(qrcode);
				
				menuClicked(qrcode);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\lahir\\OneDrive\\Desktop\\ui\\black-24dp\\2x\\baseline_qr_code_black_24dp.png"));
		btnNewButton.setBounds(0, 222, 52, 52);
		panel.add(btnNewButton);
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBounds(522, 10, 150, 539);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		
		frame.pack();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Undo");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Redo");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Help content");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
	}
	public void menuClicked(JPanel panel) {
		acc_Info.setVisible(false);
		project.setVisible(false);
		notifications.setVisible(false);
		notes.setVisible(false);
		qrcode.setVisible(false);
		
		panel.setVisible(true);
	}
}
