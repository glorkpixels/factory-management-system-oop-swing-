package ManufactoringSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JEmployeeMenu extends JFrame {

	private JPanel contentPane;
    private static JEmployeeMenu frame;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new JWorkerMenu();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public JEmployeeMenu() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(111, 11, 46, 14);
		contentPane.add(lblMenu);
		
		JRadioButton rdbtnExit = new JRadioButton("Exit");
		rdbtnExit.setBounds(24, 32, 109, 23);
		contentPane.add(rdbtnExit);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnExit.isSelected())
				{
					System.exit(1);
				}
			}
		});
		btnOk.setBounds(24, 176, 89, 23);
		contentPane.add(btnOk);
		
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(rdbtnExit);
		
	}

}
