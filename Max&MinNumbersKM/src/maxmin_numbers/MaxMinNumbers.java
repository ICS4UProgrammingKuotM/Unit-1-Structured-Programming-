package maxmin_numbers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MaxMinNumbers {

	private JFrame frmMaxMinNum;
	private JLabel lblMin;
	private JLabel lblMax;
	private JTextArea txtNumbers;
	private Random rdm = new Random();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaxMinNumbers window = new MaxMinNumbers();
					window.frmMaxMinNum.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MaxMinNumbers() {
		initialize();
	}
	
	public List<Integer> GenerateNums () {
		int max = 99;
		int min = 1;
		int size = 10;

		List<Integer> rdmNums = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int rdmNum = (rdm.nextInt((max - min) + 1) + min);
			rdmNums.add(rdmNum);
			txtNumbers.append(rdmNum + "\n");
		}
		
		return rdmNums;
	}
	
	public void getMin (List<Integer> array) {
		int minValue = 99;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) < minValue) {
				minValue = array.get(i)  ;
			}
		}
		
		lblMin.setText("Min: " + minValue);
	}
	
	public void getMax (List<Integer> array) {
		int maxValue = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) > maxValue) {
				maxValue = array.get(i)  ;
			}
		}
		
		lblMax.setText("Max: " + maxValue);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaxMinNum = new JFrame();
		frmMaxMinNum.setTitle("Max & Min Numbers KM");
		frmMaxMinNum.setBounds(100, 100, 450, 274);
		frmMaxMinNum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaxMinNum.getContentPane().setLayout(null);
		
		JButton btnGenerate = new JButton("Generate Numbers");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumbers.setText("");
				lblMin.setText("");
				lblMax.setText("");
				List<Integer> NumArray = GenerateNums();
				getMin(NumArray);
				getMax(NumArray);
			}
		});
		btnGenerate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGenerate.setBounds(32, 27, 140, 66);
		frmMaxMinNum.getContentPane().add(btnGenerate);
		
		lblMax = new JLabel("New label");
		lblMax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMax.setBounds(52, 123, 111, 27);
		frmMaxMinNum.getContentPane().add(lblMax);
		
		lblMin = new JLabel("New label");
		lblMin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMin.setBounds(52, 177, 111, 27);
		frmMaxMinNum.getContentPane().add(lblMin);
		
		txtNumbers = new JTextArea();
		txtNumbers.setBounds(262, 11, 162, 193);
		txtNumbers.setRows(10);
		frmMaxMinNum.getContentPane().add(txtNumbers);
	}
}
