import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Window.Type;
import java.awt.Point;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel Calculator;
	private JTextField User_Input;

	// variable declaration //
	
	JRadioButton Radio_Button_On = new JRadioButton("On");
	JRadioButton Radio_Button_Off = new JRadioButton("Off");
	JButton btn_Clr = new JButton("Clr");
	JButton btn_plus = new JButton("+");
	JButton btn_Space = new JButton("<---");
	JButton btn_7 = new JButton("7");
	JButton btn_8 = new JButton("8");
	JButton btn_4 = new JButton("4");
	JButton btn_1 = new JButton("1");
	JButton btn_0 = new JButton("0");
	JButton btn_5 = new JButton("5");
	JButton btn_2 = new JButton("2");
	JButton btn_period = new JButton(".");
	JButton btn_9 = new JButton("9");
	JButton btn_6 = new JButton("6");
	JButton btn_3 = new JButton("3");
	JButton btn_minus = new JButton("-");
	JButton btn_multiply = new JButton("*");
	JButton btn_divide = new JButton("/");
	JButton btn_equal = new JButton("=");
	
	// String Manipulation
	
	String number_1 = "0";
	String operator = "+";
	String number_2 = "0";
	double result;

	/**
	 * Launch the application.
	 */
	
	public void disable()
	{
		/////////////////////////////////////	
		// button off disabling calculator //
		/////////////////////////////////////	
		
		User_Input.setEnabled(false);
		
		Radio_Button_On.setEnabled(true); // on button enabled
		Radio_Button_Off.setEnabled(false); // off button disabled
		
		btn_Clr.setEnabled(false);
		btn_plus.setEnabled(false);
		btn_Space.setEnabled(false);
		btn_7.setEnabled(false);
		btn_8.setEnabled(false);
		btn_4.setEnabled(false);
		btn_1.setEnabled(false);
		btn_0.setEnabled(false);
		btn_5.setEnabled(false);
		btn_2.setEnabled(false);
		btn_period.setEnabled(false);
		btn_9.setEnabled(false);
		btn_6.setEnabled(false);
		btn_3.setEnabled(false);
		btn_minus.setEnabled(false);
		btn_multiply.setEnabled(false);
		btn_divide.setEnabled(false);
		btn_equal.setEnabled(false);
		
	}
	
	

	public void enable()
	
	{
		///////////////////////////////////
		// button on enabling calculator //
		///////////////////////////////////
		
		User_Input.setEnabled(false);
		
		Radio_Button_On.setEnabled(false); // on button disabled
		Radio_Button_Off.setEnabled(true); // off button enabled
		
		btn_Clr.setEnabled(false);
		btn_plus.setEnabled(false);
		btn_Space.setEnabled(false);
		btn_7.setEnabled(false);
		btn_8.setEnabled(false);
		btn_4.setEnabled(false);
		btn_1.setEnabled(false);
		btn_0.setEnabled(false);
		btn_5.setEnabled(false);
		btn_2.setEnabled(false);
		btn_period.setEnabled(false);
		btn_9.setEnabled(false);
		btn_6.setEnabled(false);
		btn_3.setEnabled(false);
		btn_minus.setEnabled(false);
		btn_multiply.setEnabled(false);
		btn_divide.setEnabled(false);
		btn_equal.setEnabled(false);
	}
	
	private javax.swing.JButton jButtonclr;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 **/
	
	public Calculator() {
			
		/////////////////////////////////////////////////////////
		// complete list of all buttons, radio buttons, and text file //
		/////////////////////////////////////////////////////////
		
		setLocation(new Point(500, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 275);
		Calculator = new JPanel();
		Calculator.setBackground(Color.DARK_GRAY);
		Calculator.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Calculator);
		Calculator.setLayout(null);
		
		// text output
		User_Input = new JTextField();
		User_Input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		User_Input.setBounds(6, 6, 338, 29);
		User_Input.setHorizontalAlignment(SwingConstants.RIGHT);
		User_Input.setText("0");
		User_Input.setForeground(Color.BLACK);
		Calculator.add(User_Input);
		User_Input.setColumns(10);
		
		// radio on button
		JRadioButton Radio_Button_On = new JRadioButton("On");
		Radio_Button_On.setSelected(true);
		Radio_Button_On.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				enable();
			}
		});
		
		Radio_Button_On.setForeground(Color.GREEN);
		Radio_Button_On.setBounds(0, 43, 70, 23);
		Calculator.add(Radio_Button_On);
		
		// radio off button
		JRadioButton Radio_Button_Off = new JRadioButton("Off");
		Radio_Button_Off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				disable();
			}
		});
		
		Radio_Button_Off.setForeground(Color.RED);
		Radio_Button_Off.setBounds(0, 65, 70, 23);
		Calculator.add(Radio_Button_Off);
		
		// clear button
		JButton btn_Clr = new JButton("Clr");
		btn_Clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText("");
			}
		});
		
		btn_Clr.setBackground(Color.GRAY);
		btn_Clr.setForeground(Color.DARK_GRAY);
		btn_Clr.setBounds(188, 64, 75, 29);
		Calculator.add(btn_Clr);
		
		
		// plus button
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				number_1 = User_Input.getText();
				operator = "+";
				User_Input.setText("");		
				
			}
		});
		
		btn_plus.setBackground(Color.GRAY);
		btn_plus.setForeground(Color.DARK_GRAY);
		btn_plus.setBounds(275, 64, 75, 29);
		Calculator.add(btn_plus);
		
		// space icon
		JButton btn_Space = new JButton("<---");
		btn_Space.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + " ");
			}
		});
		
		btn_Space.setBackground(Color.GRAY);
		btn_Space.setForeground(Color.DARK_GRAY);
		btn_Space.setBounds(87, 64, 75, 29);
		Calculator.add(btn_Space);
		
		// button number 7
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "7");
			}
		});
		
		btn_7.setBackground(Color.GRAY);
		btn_7.setForeground(Color.DARK_GRAY);
		btn_7.setBounds(0, 100, 75, 29);
		Calculator.add(btn_7);
		
		// button number 8
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "8");
			}
		});
		
		btn_8.setBackground(Color.GRAY);
		btn_8.setForeground(Color.DARK_GRAY);
		btn_8.setBounds(87, 100, 75, 29);
		Calculator.add(btn_8);
		
		// button number 4
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "4");
			}
		});
		
		btn_4.setBackground(Color.GRAY);
		btn_4.setForeground(Color.DARK_GRAY);
		btn_4.setBounds(0, 141, 75, 29);
		Calculator.add(btn_4);
		
		// button number 1
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "1");
			}
		});
		
		btn_1.setBackground(Color.GRAY);
		btn_1.setForeground(Color.DARK_GRAY);
		btn_1.setBounds(0, 182, 75, 29);
		Calculator.add(btn_1);
		
		// button number 0
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "0");
			}
		});
		
		btn_0.setBackground(Color.GRAY);
		btn_0.setForeground(Color.DARK_GRAY);
		btn_0.setBounds(0, 223, 75, 29);
		Calculator.add(btn_0);
		
		// button number 5
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "5");
			}
		});
		
		btn_5.setBackground(Color.GRAY);
		btn_5.setForeground(Color.DARK_GRAY);
		btn_5.setBounds(87, 141, 75, 29);
		Calculator.add(btn_5);
		
		// button number 2
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "2");
			}
		});
		
		btn_2.setBackground(Color.GRAY);
		btn_2.setForeground(Color.DARK_GRAY);
		btn_2.setBounds(87, 182, 75, 29);
		Calculator.add(btn_2);
		
		// button period
		JButton btn_period = new JButton(".");
		btn_period.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + ".");
			}
		});
		
		btn_period.setBackground(Color.GRAY);
		btn_period.setForeground(Color.DARK_GRAY);
		btn_period.setBounds(87, 223, 75, 29);
		Calculator.add(btn_period);
		
		// button number 9
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "9");
			}
		});
		
		btn_9.setBackground(Color.GRAY);
		btn_9.setForeground(Color.DARK_GRAY);
		btn_9.setBounds(188, 100, 75, 29);
		Calculator.add(btn_9);
		
		// button number 6
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "6");
			}
		});
		
		btn_6.setBackground(Color.GRAY);
		btn_6.setForeground(Color.DARK_GRAY);
		btn_6.setBounds(188, 141, 75, 29);
		Calculator.add(btn_6);
		
		// button number 3
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Input.setText(User_Input.getText() + "3");
			}
		});
		
		btn_3.setBackground(Color.GRAY);
		btn_3.setForeground(Color.DARK_GRAY);
		btn_3.setBounds(188, 182, 75, 29);
		Calculator.add(btn_3);
		
		// minus button
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number_1 = User_Input.getText();
				operator = "-";
				User_Input.setText("");		
			}
		});
		
		btn_minus.setBackground(Color.GRAY);
		btn_minus.setForeground(Color.DARK_GRAY);
		btn_minus.setBounds(275, 100, 75, 29);
		Calculator.add(btn_minus);
		
		// multiplication button
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number_1 = User_Input.getText();
				operator = "*";
				User_Input.setText("");		
			}
		});
		
		btn_multiply.setBackground(Color.GRAY);
		btn_multiply.setForeground(Color.DARK_GRAY);
		btn_multiply.setBounds(275, 141, 75, 29);
		Calculator.add(btn_multiply);
		
		// division button
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number_1 = User_Input.getText();
				operator = "/";
				User_Input.setText("");		
			}
		});
		
		btn_divide.setBackground(Color.GRAY);
		btn_divide.setForeground(Color.DARK_GRAY);
		btn_divide.setBounds(275, 182, 75, 29);
		Calculator.add(btn_divide);
		
		// total button
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									
				number_2 = User_Input.getText();
				
				if(operator.equals("+"))
				{
					result = Double.parseDouble(number_1) + Double.parseDouble(number_2);
				}
				if(operator.equals("-"))
				{
					result = Double.parseDouble(number_1) - Double.parseDouble(number_2);
				}
				if(operator.equals("*"))
				{
					result = Double.parseDouble(number_1) * Double.parseDouble(number_2);
				}
				if(operator.equals("/"))
				{
					try
					{
						result = Double.parseDouble(number_1) / Double.parseDouble(number_2);
					}
					
					catch(Exception Error)
					{
						result = 0;
					}
					
				} // end of if statement
				
				// prints result at the end of all if declared statements
				User_Input.setText(String.valueOf(result));
			}
		});
		
		btn_equal.setBackground(Color.GRAY);
		btn_equal.setForeground(Color.DARK_GRAY);
		btn_equal.setBounds(188, 223, 162, 29);
		Calculator.add(btn_equal);
		
		JLabel lblNewLabel = new JLabel("Two Numbers Only");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBounds(101, 36, 162, 16);
		Calculator.add(lblNewLabel);
		
	 // listed variables and actions performed
		
	
	}  // end of buttons, radio buttons, and text field
} // end of program
