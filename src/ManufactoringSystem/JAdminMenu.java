package ManufactoringSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class JAdminMenu extends JFrame {
	static List<Engineer> engineerList = new ArrayList<Engineer>();
	static List<Manager> managerList = new ArrayList<Manager>();
	static List<Worker> workerList = new ArrayList<Worker>();
	static List<OtherEmployee> employeeList = new ArrayList<OtherEmployee>();
	private static JTextField txtName;
//	private static JTextField txtType;
//	private static JTextField txtCountryCode;
//	private static JTextField txtCityCode;
//	private static JTextField txtNumber;

	
	public JAdminMenu()
	{
		 // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Id","Name","Type"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        
        btnAdd.setBounds(36, 615, 100, 25);
        btnUpdate.setBounds(146, 615, 100, 25);
        btnDelete.setBounds(254, 615, 100, 25);
        
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.getContentPane().setLayout(null);
        
        frame.getContentPane().add(pane);
    
        // add JButtons to the jframe
        frame.getContentPane().add(btnAdd);
        frame.getContentPane().add(btnDelete);
        frame.getContentPane().add(btnUpdate);
        
        JLabel label = new JLabel("Seat ID: ");
        label.setBounds(36, 372, 61, 14);
        frame.getContentPane().add(label);
        
        JComboBox cBoxSeatId = new JComboBox();
        cBoxSeatId.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42"}));
        cBoxSeatId.setBounds(137, 369, 42, 20);
        frame.getContentPane().add(cBoxSeatId);
        
        JLabel label_1 = new JLabel("Name:");
        label_1.setBounds(36, 404, 72, 14);
        frame.getContentPane().add(label_1);
        
        txtName = new JTextField();
        txtName.setColumns(10);
        txtName.setBounds(137, 397, 86, 20);
        frame.getContentPane().add(txtName);
        
        
        JLabel label_2 = new JLabel("Seat Type: ");
        label_2.setBounds(36, 432, 91, 14);
        frame.getContentPane().add(label_2);
        
        JComboBox cBoxSeatType = new JComboBox();
        cBoxSeatType.setModel(new DefaultComboBoxModel(new String[] {"Manager", "Engineer", "Worker", "Other Employee"}));
        cBoxSeatType.setBounds(137, 432, 100, 20);
        frame.getContentPane().add(cBoxSeatType);
        
        
        
        // create an array of objects to set the row data
        Object[] row = new Object[3];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = cBoxSeatId.getSelectedItem().toString();
                row[1] = txtName.getText();
                row[2] = cBoxSeatType.getSelectedItem().toString();
                // add row to the model
                model.addRow(row);
                if(cBoxSeatType.getSelectedItem().toString()=="Manager") {
                	 managerList.add(new Manager(txtName.getText(),Integer.parseInt(cBoxSeatId.getSelectedItem().toString()), cBoxSeatType.getSelectedItem().toString()));
                }
                if(cBoxSeatType.getSelectedItem().toString()=="Engineer") {
                	engineerList.add(new Engineer(txtName.getText(),Integer.parseInt(cBoxSeatId.getSelectedItem().toString()), cBoxSeatType.getSelectedItem().toString()));
                }
                if(cBoxSeatType.getSelectedItem().toString()=="Worker") {
                	workerList.add(new Worker(txtName.getText(),Integer.parseInt(cBoxSeatId.getSelectedItem().toString()), cBoxSeatType.getSelectedItem().toString()));
                }
                if(cBoxSeatType.getSelectedItem().toString()=="Other Employee") {
                	employeeList.add(new OtherEmployee(txtName.getText(),Integer.parseInt(cBoxSeatId.getSelectedItem().toString()), cBoxSeatType.getSelectedItem().toString()));
                }
               
            }
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                    
                    model.getValueAt(i, 0);
                    model.getValueAt(i, 1);
                    model.getValueAt(i, 2);
                    
                  /* if(model.getValueAt(i, 2)=="Manager") {
                   	 	managerList.remove(Integer.parseInt(model.getValueAt(i, 0).toString()));
                   }
                   if(model.getValueAt(i, 2)=="Engineer") {
                	   engineerList.remove(model.getValueAt(i, 0));
                   }
                   if(model.getValueAt(i, 2)=="Worker") {
                	   workerList.remove(model.getValueAt(i, 0));
                   }
                   if(model.getValueAt(i, 2)=="Other Employee") {
                   		employeeList.remove(model.getValueAt(i, 0));
                   }*/
                   
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            cBoxSeatId.setSelectedItem(model.getValueAt(i, 0).toString());
            txtName.setText(model.getValueAt(i, 1).toString());
            cBoxSeatType.setSelectedItem(model.getValueAt(i, 2).toString());
            
            /*model.getValueAt(i, 0);
            model.getValueAt(i, 1);
            model.getValueAt(i, 2);
            if(model.getValueAt(i, 2)=="Manager") {
           	 	managerList.remove(model.getValueAt(i, 0));
           	 	managerList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new Manager(model.getValueAt(i, 1).toString(),Integer.parseInt(model.getValueAt(i, 0).toString()),model.getValueAt(i, 2).toString()));
           	}
           if(model.getValueAt(i, 2)=="Engineer") {
        	   engineerList.remove(model.getValueAt(i, 0));
        	   engineerList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new Engineer(model.getValueAt(i, 1).toString(),Integer.parseInt(model.getValueAt(i, 0).toString()),model.getValueAt(i, 2).toString()));
           }
           if(model.getValueAt(i, 2)=="Worker") {
        	   workerList.remove(model.getValueAt(i, 0));
        	   workerList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new Worker(model.getValueAt(i, 1).toString(),Integer.parseInt(model.getValueAt(i, 0).toString()),model.getValueAt(i, 2).toString()));
           }
           if(model.getValueAt(i, 2)=="Other Employee") {
           		employeeList.remove(model.getValueAt(i, 0));
           		employeeList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new OtherEmployee(model.getValueAt(i, 1).toString(),Integer.parseInt(model.getValueAt(i, 0).toString()),model.getValueAt(i, 2).toString()));
           }*/
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(cBoxSeatId.getSelectedItem().toString(), i, 0);
                   model.setValueAt(txtName.getText(), i, 1);
                   model.setValueAt(cBoxSeatType.getSelectedItem().toString(), i, 2);
//                   
  
                  /* if(cBoxSeatType.getSelectedItem().toString()=="Manager") {
                  	 	managerList.remove(model.getValueAt(i, 0));
                  	 	managerList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new Manager(txtName.getText(),Integer.parseInt(model.getValueAt(i, 0).toString()),cBoxSeatType.getSelectedItem().toString()));
                  	}
                  if(cBoxSeatType.getSelectedItem().toString()=="Engineer") {
               	   		engineerList.remove(model.getValueAt(i, 0));
               	   		engineerList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new Engineer(txtName.getText(),Integer.parseInt(model.getValueAt(i, 0).toString()),cBoxSeatType.getSelectedItem().toString()));
               	   }
                  if(cBoxSeatType.getSelectedItem().toString()=="Worker") {
                	  	workerList.remove(model.getValueAt(i, 0));
                	  	workerList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new Worker(txtName.getText(),Integer.parseInt(model.getValueAt(i, 0).toString()),cBoxSeatType.getSelectedItem().toString()));
                  }
                  if(cBoxSeatType.getSelectedItem().toString()=="Other Employee") {
                  		employeeList.remove(model.getValueAt(i, 0));
                  		employeeList.add(Integer.parseInt(model.getValueAt(i, 0).toString()), new OtherEmployee(txtName.getText(),Integer.parseInt(model.getValueAt(i, 0).toString()),cBoxSeatType.getSelectedItem().toString()));
                  }*/
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        frame.setSize(860,769);
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
}
	