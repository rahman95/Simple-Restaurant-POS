package menu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;

public class infoDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_2;
	static int customers = 0;
	static int courses = 0;
	static String table;
	private JTextField textField_1;
	private JTextField txtStartersMains;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			infoDialog dialog = new infoDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public infoDialog() {
		setTitle("Restaurant Menu");
		setBounds(100, 100, 312, 370);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNumberOfCustomers = new JLabel("Number of Customers:");
			lblNumberOfCustomers.setBounds(23, 11, 132, 28);
			contentPanel.add(lblNumberOfCustomers);
		}
		{
			JLabel lblNumberOfCourses = new JLabel("Number of Courses:");
			lblNumberOfCourses.setBounds(23, 96, 132, 28);
			contentPanel.add(lblNumberOfCourses);
		}
		{
			textField = new JTextField("0");
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Tahoma", Font.BOLD, 12));
			textField.setEditable(false);
			textField.setBounds(132, 50, 39, 35);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblTableNumber = new JLabel("Table Number:");
			lblTableNumber.setBounds(23, 223, 109, 14);
			contentPanel.add(lblTableNumber);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(117, 220, 158, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("-");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Delete to Customer count
					if(customers == 0){
                		
                	}
                	else{
                	customers--;
                	String count = Integer.toString(customers);
                	textField.setText(count);
                	}
					
				}
			});
			btnNewButton.setBounds(74, 50, 48, 35);
			contentPanel.add(btnNewButton);
		}
		{
			JButton button = new JButton("+");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				//Add to Customer count
					if (customers < 2){
                	customers++;
                	String count = Integer.toString(customers);
                	textField.setText(count);
					}
					else
					{
						System.out.println("Reached max");
					}
				}
			});
			button.setBounds(181, 50, 48, 35);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("-");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Delete to courses count
					if(courses == 0){
                		
                	}
                	else{
                	courses--;
                	String count = Integer.toString(courses);
                	textField_1.setText(count);
                	if(courses == 1){
                		txtStartersMains.setText("Starters Only");
                	}
                	else if (courses == 2){
                		txtStartersMains.setText("Starters and Mains Only");
                	}
                	else if (courses == 3){
                		txtStartersMains.setText("Starters, Mains & Deserts");
                	}
                	else{
                		txtStartersMains.setText("");
                	}
                	}
				}
			});
			button.setBounds(74, 135, 48, 35);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("+");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//Add to Course count
					if (courses < 3){
						courses++;
                	String count = Integer.toString(courses);
                	textField_1.setText(count);
                	if(courses == 1){
                		txtStartersMains.setText("Starters Only");
                	}
                	else if (courses == 2){
                		txtStartersMains.setText("Starters and Mains Only");
                	}
                	else if (courses == 3){
                		txtStartersMains.setText("Starters, Mains & Deserts");
                	}
                	else{
                		txtStartersMains.setText("");
                	}
					}
					else
					{
						System.out.println("Reached max");
					}
					
				}
			});
			button.setBounds(181, 135, 48, 35);
			contentPanel.add(button);
		}
		{
			textField_1 = new JTextField("0");
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(132, 135, 39, 35);
			contentPanel.add(textField_1);
		}
		{
			JButton okButton = new JButton("Submit");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if ((customers != 0) && (courses != 0) && (textField_2.getText() != null  && !textField_2.getText().isEmpty())){
						//Everything filled in
						// now start Menu with this info
						table = textField_2.getText();
						menu.main(null);
					}
					else{
						//not complete info
						JOptionPane.showMessageDialog(null,
							    "Please fill in all the required fields!",
							    "Error",
							    JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			okButton.setBounds(96, 276, 115, 28);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(23, 259, 250, 6);
			contentPanel.add(separator);
		}
		
		txtStartersMains = new JTextField();
		txtStartersMains.setForeground(Color.BLUE);
		txtStartersMains.setHorizontalAlignment(SwingConstants.CENTER);
		txtStartersMains.setEditable(false);
		txtStartersMains.setBounds(74, 178, 155, 20);
		contentPanel.add(txtStartersMains);
		txtStartersMains.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(null);
		}
	}
}
