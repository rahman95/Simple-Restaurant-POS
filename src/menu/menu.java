package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class menu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private static JTextArea textArea;
	private static JButton btnSamosas, btnKebaab, btnWings, btnRibs, btnBeefBurger,btnChickenBurger, btnFishBurger, btnVegBurger,btnSpecialBurger,btnMountainBurger, btnCake, btnMilkshake,	btnWaffles,	btnIcecream;
	static int customer = infoDialog.customers;
	static int course = infoDialog.courses;
	static String table = infoDialog.table;
	String[] starters = {"Samosa - 300 - 3.50 - Portion of 6 warm Samosas", "Kebaab - 250 - 3.50 - Portion of 6 warm Kebaab", "Wings - 400 - 4.99 - Portion of 4 tender wings", "Ribs - 350 - 4.50 - Portion of 4 succulent Ribs"};
	String[] mains = {"Beef Burger - 500 - 4.99 - Signature Beef Burger with Fries and Drink", "Chicken Burger - 500 - 4.99 - Signature Chicken Burger with Fries and Drink", "Fish Burger - 400 - 4.69 - Signature Fish Burger with Fries and Drink", "Veg Burger - 400 - 4.69 - Signature Veg Burger with Fries and Drink" , "Special Burger - 600 - 5.99 - Our Chef's special combo Burger with Fries and Drink", "Mountain Burger - 400 - 4.99 - Signature Chicken Burger topped with a hashbrown with Fries and Drink"};
	String[] deserts = {"Cake - 300 - 3.50 - warm and delicious cake", "Milkshakes - 300 - 3.50 - cold and refreshing milkshakes", "Waffles - 300 - 3.50 - warm waffles topped with choclate sauce", "Ice-Cream - 300 - 3.50 - only the best gelatto ice cream"};
	int totalcal = 0;
	double totalprice = 0;
	static DecimalFormat df2 = new DecimalFormat(".##");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					addInfo();
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
	public menu() {
		setResizable(false);
		setTitle("Restaurant Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(607, 562, 129, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total Calories:");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(486, 561, 111, 28);
		contentPane.add(lblTotal);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(486, 47, 250, 503);
		contentPane.add(textArea);
		
		JLabel lblRestaurantOrder = new JLabel("Restaurant Order");
		lblRestaurantOrder.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRestaurantOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestaurantOrder.setBounds(557, 22, 99, 14);
		contentPane.add(lblRestaurantOrder);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(8, 155, 446, 2);
		contentPane.add(separator);
		
		btnWings = new JButton("Wings");
		btnWings.setEnabled(false);
		btnWings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = starters[2];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnWings.setBounds(241, 47, 89, 68);
		contentPane.add(btnWings);
		
		btnRibs = new JButton("Ribs");
		btnRibs.setEnabled(false);
		btnRibs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = starters[3];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
				
			}
		});
		btnRibs.setBounds(365, 47, 89, 68);
		contentPane.add(btnRibs);
		
		btnBeefBurger = new JButton("Beef Burger");
		btnBeefBurger.setEnabled(false);
		btnBeefBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = mains[0];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnBeefBurger.setBounds(10, 188, 143, 68);
		contentPane.add(btnBeefBurger);
		
		btnChickenBurger = new JButton("Chicken Burger");
		btnChickenBurger.setEnabled(false);
		btnChickenBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = mains[1];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnChickenBurger.setBounds(163, 188, 143, 68);
		contentPane.add(btnChickenBurger);
		
		btnFishBurger = new JButton("Fish Burger");
		btnFishBurger.setEnabled(false);
		btnFishBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = mains[2];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnFishBurger.setBounds(316, 188, 143, 68);
		contentPane.add(btnFishBurger);
		
		btnVegBurger = new JButton("Veg Burger");
		btnVegBurger.setEnabled(false);
		btnVegBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = mains[3];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
				
			}
		});
		btnVegBurger.setBounds(10, 301, 143, 68);
		contentPane.add(btnVegBurger);
		
		btnSpecialBurger = new JButton("Special Burger");
		btnSpecialBurger.setEnabled(false);
		btnSpecialBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = mains[4];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnSpecialBurger.setBounds(163, 301, 143, 68);
		contentPane.add(btnSpecialBurger);
		
		btnMountainBurger = new JButton("Mountain Burger");
		btnMountainBurger.setEnabled(false);
		btnMountainBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = mains[5];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
				
			}
		});
		btnMountainBurger.setBounds(316, 301, 143, 68);
		contentPane.add(btnMountainBurger);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(8, 408, 446, 2);
		contentPane.add(separator_1);
		
		btnCake = new JButton("Cake");
		btnCake.setEnabled(false);
		btnCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = deserts[0];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
				
			}
		});
		btnCake.setBounds(10, 446, 89, 68);
		contentPane.add(btnCake);
		
		btnMilkshake = new JButton("Shake");
		btnMilkshake.setEnabled(false);
		btnMilkshake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = deserts[1];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnMilkshake.setBounds(122, 446, 89, 68);
		contentPane.add(btnMilkshake);
		
		btnWaffles = new JButton("Waffles");
		btnWaffles.setEnabled(false);
		btnWaffles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = deserts[2];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnWaffles.setBounds(241, 446, 89, 68);
		contentPane.add(btnWaffles);
		
		btnIcecream = new JButton("Ice-Cream");
		btnIcecream.setEnabled(false);
		btnIcecream.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnIcecream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = deserts[3];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnIcecream.setBounds(365, 446, 89, 68);
		contentPane.add(btnIcecream);
		
		JLabel lblStarters = new JLabel("Starters");
		lblStarters.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStarters.setHorizontalAlignment(SwingConstants.CENTER);
		lblStarters.setBounds(211, 22, 56, 14);
		contentPane.add(lblStarters);
		
		JLabel lblMains = new JLabel("Mains");
		lblMains.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMains.setHorizontalAlignment(SwingConstants.CENTER);
		lblMains.setBounds(211, 168, 46, 14);
		contentPane.add(lblMains);
		
		JLabel lblDeserts = new JLabel("Deserts");
		lblDeserts.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeserts.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeserts.setBounds(211, 421, 46, 14);
		contentPane.add(lblDeserts);
		
		JButton btnNewButton_1 = new JButton("Submit Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//submit order
				if(totalprice > 0){
					
					int option = JOptionPane.showConfirmDialog (null,
							"Your Order has been placed!" + "\n" + "\n" + "--------------(Order)--------------" + "\n" + "Total Calories - " + totalcal + "\n" + "Total Price - £" + totalprice + "\n" + "---------(End of Order)---------" + "\n" + "Click Yes to Pay and Finish",
							"Success",
							JOptionPane.INFORMATION_MESSAGE);
					if (option == JOptionPane.OK_OPTION || option == JOptionPane.CLOSED_OPTION){
						//Close window and restart infoDialog
						dispose();
						infoDialog.main(null);
					}
					
				}else{
					JOptionPane.showMessageDialog(null,
							"Please select items from the Menu!",
							"Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(147, 588, 191, 46);
		contentPane.add(btnNewButton_1);
		
		JLabel lblCalPrice = new JLabel("300kcal | \u00A33.50");
		lblCalPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalPrice.setBounds(8, 126, 91, 14);
		contentPane.add(lblCalPrice);
		
		JLabel lblkcal = new JLabel("250kcal | \u00A33.50");
		lblkcal.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal.setBounds(122, 126, 91, 14);
		contentPane.add(lblkcal);
		
		JLabel lblkcal_1 = new JLabel("400kcal | \u00A34.99");
		lblkcal_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal_1.setBounds(241, 126, 91, 14);
		contentPane.add(lblkcal_1);
		
		JLabel lblkcal_2 = new JLabel("350kcal | \u00A34.50");
		lblkcal_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal_2.setBounds(365, 126, 91, 14);
		contentPane.add(lblkcal_2);
		
		JLabel lblkcal_3 = new JLabel("500kcal | \u00A34.99");
		lblkcal_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal_3.setBounds(35, 264, 91, 14);
		contentPane.add(lblkcal_3);
		
		JLabel label = new JLabel("500kcal | \u00A34.99");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(192, 264, 91, 14);
		contentPane.add(label);
		
		JLabel lblkcal_4 = new JLabel("400kcal | \u00A34.69");
		lblkcal_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal_4.setBounds(341, 267, 91, 14);
		contentPane.add(lblkcal_4);
		
		JLabel lblkcal_7 = new JLabel("400kcal | \u00A34.69");
		lblkcal_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal_7.setBounds(35, 380, 91, 14);
		contentPane.add(lblkcal_7);
		
		JLabel lblkcal_6 = new JLabel("600kcal | \u00A35.99");
		lblkcal_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal_6.setBounds(192, 380, 91, 14);
		contentPane.add(lblkcal_6);
		
		JLabel lblkcal_5 = new JLabel("400kcal | \u00A34.99");
		lblkcal_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblkcal_5.setBounds(341, 380, 91, 14);
		contentPane.add(lblkcal_5);
		
		JLabel label_1 = new JLabel("300kcal | \u00A33.50");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(8, 525, 91, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("300kcal | \u00A33.50");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(122, 525, 91, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("300kcal | \u00A33.50");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(241, 525, 91, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("300kcal | \u00A33.50");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(365, 525, 91, 14);
		contentPane.add(label_4);
		
		JLabel lblTotalCost = new JLabel("Total Cost:");
		lblTotalCost.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalCost.setBounds(486, 603, 111, 28);
		contentPane.add(lblTotalCost);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(607, 604, 129, 30);
		contentPane.add(textField_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(8, 562, 446, 2);
		contentPane.add(separator_2);
		
		btnKebaab = new JButton("Kebaab");
		btnKebaab.setEnabled(false);
		btnKebaab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = starters[1];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnKebaab.setBounds(122, 48, 89, 68);
		contentPane.add(btnKebaab);
		
		btnSamosas = new JButton("Samosas");
		btnSamosas.setEnabled(false);
		btnSamosas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Getting item info from Array
				String item = starters[0];
				String[] parts = item.split("- ");
				String name = parts[0]; 
				String cal = parts[1];
				String price = parts[2];
				String desc = parts[3];
				
				//Adding to Order textarea
				textArea.append("- " + name + cal +"kcal | " + "£" + price + " - "+ desc +"\n");
				textArea.append("***" +"\n");
				
				//Update Calories and Price Method
				caloriesadd(cal);
				priceadd(price);
			}
		});
		btnSamosas.setBounds(10, 48, 89, 68);
		contentPane.add(btnSamosas);
	}

	protected void priceadd(String price) {
		// add price to total
		
		double itemprice = Double.parseDouble(price);
		double tempprice = itemprice + totalprice;
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		String formatedprice = formatter.format(tempprice);
		totalprice = Double.parseDouble(formatedprice);
		
		String totalprices = Double.toString(totalprice);
		textField_2.setText(totalprices);
		
	}

	protected void caloriesadd(String cal) {
		// add calories to total
		
		int itemcal = Integer.parseInt(cal.replaceAll("\\s",""));
		totalcal = itemcal + totalcal;
		String totalcalories = Integer.toString(totalcal);
		textField.setText(totalcalories);
		
	}
	
	private static void addInfo(){
		int Customers = customer;
		int Courses = course;
		String tables = table; 
		
		textArea.append("----------------------(Restaurant)----------------------" + "\n");
		textArea.append("Table Number = " + tables +"\n");
		textArea.append("Total Customers = " + Customers +"\n");
		textArea.append("Courses = " + Courses +"\n");
		textArea.append("------------------------------()------------------------------" + "\n");
		
		
		if (Courses == 1){
			//set only starters as enabled
			btnSamosas.setEnabled(true);
			btnKebaab.setEnabled(true);
			btnWings.setEnabled(true);
			btnRibs.setEnabled(true);
		}
		else if (Courses == 2){
			//set only starters and mains as enabled
			btnSamosas.setEnabled(true);
			btnKebaab.setEnabled(true);
			btnWings.setEnabled(true);
			btnRibs.setEnabled(true);
			
			btnBeefBurger.setEnabled(true);
			btnChickenBurger.setEnabled(true);
			btnFishBurger.setEnabled(true);
			btnVegBurger.setEnabled(true);
			btnSpecialBurger.setEnabled(true);
			btnMountainBurger.setEnabled(true);
		}
		else{
			btnSamosas.setEnabled(true);
			btnKebaab.setEnabled(true);
			btnWings.setEnabled(true);
			btnRibs.setEnabled(true);
			
			btnBeefBurger.setEnabled(true);
			btnChickenBurger.setEnabled(true);
			btnFishBurger.setEnabled(true);
			btnVegBurger.setEnabled(true);
			btnSpecialBurger.setEnabled(true);
			btnMountainBurger.setEnabled(true);
			
			btnCake.setEnabled(true);
			btnMilkshake.setEnabled(true);
			btnWaffles.setEnabled(true);
			btnIcecream.setEnabled(true);
		}
	}
}
