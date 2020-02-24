package simple_calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class SimpleCalculator {
	
	/*
	 * Created by: Kuot Mariak
	 * Created on: 10-Feb-2019
	 * Created for: ICS4U
	 * Day #6 (Simple Calculator)
	 * Simple Calculator
	*/
	
	private JFrame frmSimpleCalculator;
	public static JTextField txtUserNum1;
	public static JTextField txtUserNum2;
	private static JLabel lblAnswer;
	private static JButton btnAdd;
	private static JButton btnSubtract;
	private static JButton btnMultiply;
	private static JButton btnDivide;
	public static String userNumber = "";
	public static String userNumber2 = "";
	public static double answer = 0;
	public static double num1 = 0;
	public static double num2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setTitle("SimpleCalculatorKM");
		frmSimpleCalculator.setBounds(100, 100, 275, 376);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		JLabel lblAskNumber1 = new JLabel("Please enter a number.");
		lblAskNumber1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAskNumber1.setBounds(10, 11, 163, 23);
		frmSimpleCalculator.getContentPane().add(lblAskNumber1);
		
		txtUserNum1 = new JTextField();
		txtUserNum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUserNum1.setBounds(10, 44, 114, 36);
		frmSimpleCalculator.getContentPane().add(txtUserNum1);
		txtUserNum1.setColumns(10);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userNumber = txtUserNum1.getText();
					num1 = Double.parseDouble(userNumber);

					userNumber2 = txtUserNum2.getText();
					num2 = Double.parseDouble(userNumber2);
					
					answer = num1 + num2;
					lblAnswer.setText("The answer is: " + answer);
					
				}catch (NumberFormatException e1) {
					lblAnswer.setText("Please enter a number!");
				}
					
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(10, 174, 52, 43);
		frmSimpleCalculator.getContentPane().add(btnAdd);
		
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userNumber = txtUserNum1.getText();
					num1 = Double.parseDouble(userNumber);
					
					userNumber2 = txtUserNum2.getText();
					num2 = Double.parseDouble(userNumber2);
					
					answer = num1 - num2;
					lblAnswer.setText("The answer is: " + answer);
					
				}catch (NumberFormatException e1) {
					lblAnswer.setText("Please enter a number!");
				}
			
				
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtract.setBounds(72, 174, 52, 43);
		frmSimpleCalculator.getContentPane().add(btnSubtract);
		
		btnMultiply = new JButton("\u00D7");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userNumber = txtUserNum1.getText();
					num1 = Double.parseDouble(userNumber);
					
					userNumber2 = txtUserNum2.getText();
					num2 = Double.parseDouble(userNumber2);
					
					answer = num1 * num2;
					lblAnswer.setText("The answer is: " + answer);
					
				}catch (NumberFormatException e1) {
					lblAnswer.setText("Please enter a number!");
				}
				
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(132, 174, 52, 43);
		frmSimpleCalculator.getContentPane().add(btnMultiply);
		
		btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userNumber = txtUserNum1.getText();
					num1 = Double.parseDouble(userNumber);
					
					userNumber2 = txtUserNum2.getText();
					num2 = Double.parseDouble(userNumber2);
					
					answer = num1 / num2;
					lblAnswer.setText("The answer is: " + answer);
					
				}catch (NumberFormatException e1) {
					lblAnswer.setText("Please enter a number!");
				}
				
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(194, 174, 52, 43);
		frmSimpleCalculator.getContentPane().add(btnDivide);
		
		lblAnswer = new JLabel("The answer is:");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnswer.setBounds(10, 228, 236, 98);
		frmSimpleCalculator.getContentPane().add(lblAnswer);
		
		JLabel lblAskNumber2 = new JLabel("Please enter a second number.");
		lblAskNumber2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAskNumber2.setBounds(10, 91, 218, 23);
		frmSimpleCalculator.getContentPane().add(lblAskNumber2);
		
		txtUserNum2 = new JTextField();
		txtUserNum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUserNum2.setColumns(10);
		txtUserNum2.setBounds(10, 125, 114, 36);
		frmSimpleCalculator.getContentPane().add(txtUserNum2);
	}
}
