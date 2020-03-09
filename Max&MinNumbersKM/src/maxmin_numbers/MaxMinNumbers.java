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
	
	public int[] GenerateNums () {
		int max = 99;
		int min = 1;
		int size = 10;
		int[] numbers = new int[size];
		
		String Listnum = "";
		List<Integer> rdmNums = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int rdmNum = (rdm.nextInt((max - min) + 1) + min);
			rdmNums.add(rdmNum);
			int num = rdmNums.get(i);
			Listnum = (num + "\n");
		}
		
		txtNumbers.setText(Listnum);
		return numbers;
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
				GenerateNums();
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
		frmMaxMinNum.getContentPane().add(txtNumbers);
	}
}
