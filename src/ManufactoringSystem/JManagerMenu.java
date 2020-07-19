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

public class JManagerMenu extends JFrame {

	private JPanel contentPane;
    private static JManagerMenu frame;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new JManagerMenu();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//	}

	/**
	 * Create the frame.
	 */
	public JManagerMenu() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(111, 11, 46, 14);
		contentPane.add(lblMenu);
		
		JRadioButton rdbtnOrder = new JRadioButton("Manage Order");
		rdbtnOrder.setBounds(24, 32, 109, 23);
		contentPane.add(rdbtnOrder);
		
		JRadioButton rdbtnPlan = new JRadioButton("Manage Plan");
		rdbtnPlan.setBounds(24, 58, 331, 23);
		contentPane.add(rdbtnPlan);
		
		JRadioButton rdbtnExit = new JRadioButton("Exit");
		rdbtnExit.setBounds(24, 84, 245, 23);
		contentPane.add(rdbtnExit);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnOrder.isSelected())
				{
					new JOrderTable().setVisible(true);
				}
				else if(rdbtnPlan.isSelected())
				{
					new JPlanTable().setVisible(true);
				}
				else
				{
					System.exit(1);
				}
			}
		});
		btnOk.setBounds(24, 220, 89, 23);
		contentPane.add(btnOk);
		
		rdbtnOrder.setSelected(true);
		
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(rdbtnOrder);
		btngroup.add(rdbtnPlan);
		btngroup.add(rdbtnExit);
		
	}

}
