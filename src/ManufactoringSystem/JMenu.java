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

public class JMenu extends JFrame {

	private JPanel contentPane;
    private static JMenu frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

	/**
	 * Create the frame.
	 */
	public JMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(111, 11, 46, 14);
		contentPane.add(lblMenu);
		
		JRadioButton rdbtnManager = new JRadioButton("Manager");
		rdbtnManager.setBounds(24, 32, 109, 23);
		contentPane.add(rdbtnManager);
		
		JRadioButton rdbtnEngineer = new JRadioButton("Engineer");
		rdbtnEngineer.setBounds(24, 58, 331, 23);
		contentPane.add(rdbtnEngineer);
		
		JRadioButton rdbtnWorker = new JRadioButton("Worker");
		rdbtnWorker.setBounds(24, 84, 245, 23);
		contentPane.add(rdbtnWorker);
		
		JRadioButton rdbtnOtherEmployee = new JRadioButton("Other Employee");
		rdbtnOtherEmployee.setBounds(24, 110, 150, 23);
		contentPane.add(rdbtnOtherEmployee);
		
		JRadioButton rdbtnShow = new JRadioButton("Show storage and product manufactoring");
		rdbtnShow.setBounds(24, 136, 331, 23);
		contentPane.add(rdbtnShow);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBounds(24, 158, 109, 23);
		contentPane.add(rdbtnAdmin);
		
		JRadioButton rdbtnExit = new JRadioButton("Exit");
		rdbtnExit.setBounds(24, 184, 109, 23);
		contentPane.add(rdbtnExit);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnManager.isSelected())
				{
					new JManagerEnter().frame.setVisible(true);
				}
				else if(rdbtnEngineer.isSelected())
				{
					new JEngineerEnter().frame.setVisible(true);
				}
				else if(rdbtnWorker.isSelected())
				{
					new JWorkerEnter().frame.setVisible(true);
				}
				else if(rdbtnOtherEmployee.isSelected())
				{
					new JEmployeeEnter().frame.setVisible(true);
				}
				else if(rdbtnAdmin.isSelected())
				{
					new JAdminEnter().frame.setVisible(true);
				}
				else if(rdbtnShow.isSelected())
				{
					new JShowMenu().setVisible(true);
				}
				else
				{
					System.exit(1);
				}
			}
		});
		btnOk.setBounds(24, 220, 89, 23);
		contentPane.add(btnOk);
		
		rdbtnManager.setSelected(true);
		
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(rdbtnManager);
		btngroup.add(rdbtnEngineer);
		btngroup.add(rdbtnWorker);
		btngroup.add(rdbtnOtherEmployee);
		btngroup.add(rdbtnShow);
		btngroup.add(rdbtnAdmin);
		btngroup.add(rdbtnExit);
		
	}

}
