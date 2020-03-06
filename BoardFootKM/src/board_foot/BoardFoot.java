package board_foot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;

public class BoardFoot {

	private JFrame frmBoardFoot;
	private JTextField txtFirstNum;
	private JTextField txtSecondNum;
	private JLabel lblThirdDimension;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardFoot window = new BoardFoot();
					window.frmBoardFoot.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BoardFoot() {
		initialize();
	}
	
	public void CalculateBoardFoot (double FirstNum, double SecondNum) {
		double FirstDimension = FirstNum;
		double SecondDimension = SecondNum;
		double ThirdDimension = 0;
		double Boardfoot = 1;
		String format = "#.##";
		DecimalFormat twoPlaces = new DecimalFormat(format);
		
		ThirdDimension = (Boardfoot / FirstDimension / SecondDimension) * 12;
		twoPlaces.format(ThirdDimension);
		String FinalDimension = Double.toString(ThirdDimension) + " inches ^3";
		lblThirdDimension.setText("Third Dimension is " + FinalDimension);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBoardFoot = new JFrame();
		frmBoardFoot.setTitle("Board Foot KM");
		frmBoardFoot.setBounds(100, 100, 619, 214);
		frmBoardFoot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoardFoot.getContentPane().setLayout(null);
		
		JLabel lblEnterFirstNum = new JLabel("Enter First number");
		lblEnterFirstNum.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterFirstNum.setBounds(10, 11, 174, 32);
		frmBoardFoot.getContentPane().add(lblEnterFirstNum);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter Second number");
		lblEnterSecondNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterSecondNumber.setBounds(345, 11, 187, 32);
		frmBoardFoot.getContentPane().add(lblEnterSecondNumber);
		
		txtFirstNum = new JTextField();
		txtFirstNum.setBounds(10, 43, 248, 26);
		frmBoardFoot.getContentPane().add(txtFirstNum);
		txtFirstNum.setColumns(10);
		
		txtSecondNum = new JTextField();
		txtSecondNum.setColumns(10);
		txtSecondNum.setBounds(345, 43, 248, 26);
		frmBoardFoot.getContentPane().add(txtSecondNum);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					double FirstNum = Double.parseDouble(txtFirstNum.getText());
					double SecondNum = Double.parseDouble(txtSecondNum.getText());
					
					CalculateBoardFoot(FirstNum, SecondNum);
					
				}catch (InputMismatchException e) {
					JOptionPane.showMessageDialog(frmBoardFoot, "Please enter valid numbers into both fields!");
				}
				
				
				
				
				
				
				
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalculate.setBounds(247, 80, 109, 37);
		frmBoardFoot.getContentPane().add(btnCalculate);
		
		lblThirdDimension = new JLabel("Third dimension");
		lblThirdDimension.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThirdDimension.setBounds(99, 121, 363, 32);
		frmBoardFoot.getContentPane().add(lblThirdDimension);
	}
}
