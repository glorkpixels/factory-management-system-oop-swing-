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

public class JShowMenu extends JFrame {

	private JPanel contentPane;
    private static JShowMenu frame;
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
	public JShowMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(111, 11, 46, 14);
		contentPane.add(lblMenu);
		
		JRadioButton rdbtnStorage = new JRadioButton("Manage Storage");
		rdbtnStorage.setBounds(24, 32, 331, 23);
		contentPane.add(rdbtnStorage);
		
		JRadioButton rdbtnProduct = new JRadioButton("Manage Product");
		rdbtnProduct.setBounds(24, 58, 331, 23);
		contentPane.add(rdbtnProduct);
		
		JRadioButton rdbtnExit = new JRadioButton("Exit");
		rdbtnExit.setBounds(24, 84, 245, 23);
		contentPane.add(rdbtnExit);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnStorage.isSelected())
				{
					new JStorageTable().setVisible(true);
				}
				else if(rdbtnProduct.isSelected())
				{
					new JProductTable().setVisible(true);
				}
				else
				{
					System.exit(1);
				}
			}
		});
		btnOk.setBounds(24, 220, 89, 23);
		contentPane.add(btnOk);
		
		rdbtnStorage.setSelected(true);
		
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(rdbtnStorage);
		btngroup.add(rdbtnProduct);
		btngroup.add(rdbtnExit);
		
	}

}
