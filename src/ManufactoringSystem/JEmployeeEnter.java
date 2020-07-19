package ManufactoringSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JPanel;

public class JEmployeeEnter {

	protected JFrame frame;
	private JLabel lblID;
	private JTextField txtID;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnLogIn;
	private JPanel panel;

	//public static Bus bus=new Bus("35 DEU 01", 42);
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public JEmployeeEnter() {
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblID = new JLabel("Employee ID:");
		lblID.setBounds(26, 14, 89, 14);
		
		
		txtID = new JTextField();
		txtID.setBounds(125, 11, 86, 20);
		
		txtID.setColumns(10);
		
		lblPassword = new JLabel("Password :");
		lblPassword.setBounds(26, 59, 89, 14);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(125, 59, 86, 20);
		
		
		btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtID.getText().equals("4000") && passwordField.getText().equals("employee1234"))
				{
					new JEmployeeMenu().setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Wrong password or user ID");
				}
				
			}
		});
		btnLogIn.setBounds(122, 100, 89, 23);
		
		
		panel = new JPanel();
		panel.setBounds(10, 11, 340, 215);
		panel.setLayout(null);
		
		panel.add(lblID);
		panel.add(txtID);
		panel.add(lblPassword);
		panel.add(passwordField);
		panel.add(btnLogIn);
		frame.getContentPane().add(panel);
		
		
//		frame.setSize(860,769);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	frame.setVisible(false);
		    }
		});
        
        frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

}
