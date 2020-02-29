package dice_game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.SwingConstants;

import javax.swing.JButton;

public class DiceGame {

	private JFrame frmDiceGame;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtUserGuess;
	public JLabel lblNumOfTimesWrong;
	public JLabel lblAnswer;
	private JButton btnGenerate;
	public Random rdm = new Random();
	
	
	public int Num1;
	public int Num2;
	public int userNumber;
	public int WrongCount;
	public double RandomNumber;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceGame window = new DiceGame();
					window.frmDiceGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiceGame() {
		initialize();
	}
	
	public int RandomNumGen (int min, int max) {
		int RandomNum = rdm.nextInt((max - min) + 1) + min;
		return RandomNum;
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiceGame = new JFrame();
		frmDiceGame.setTitle("Dice GameKM");
		frmDiceGame.setBounds(100, 100, 450, 300);
		frmDiceGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiceGame.getContentPane().setLayout(null);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(10, 36, 86, 20);
		frmDiceGame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblEnterRangeOf = new JLabel("Enter range of numbers (Ex. 1 to 10)");
		lblEnterRangeOf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterRangeOf.setBounds(10, 11, 370, 20);
		frmDiceGame.getContentPane().add(lblEnterRangeOf);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(144, 36, 86, 20);
		frmDiceGame.getContentPane().add(txtNum2);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTo.setBounds(106, 37, 28, 14);
		frmDiceGame.getContentPane().add(lblTo);
		
		JLabel lblPickGuess = new JLabel("Enter your guess between range you inputted)");
		lblPickGuess.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPickGuess.setBounds(10, 67, 370, 20);
		frmDiceGame.getContentPane().add(lblPickGuess);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				userNumber = Integer.parseInt(txtUserGuess.getText());

				try {
					if (userNumber == RandomNumber) {	
						lblAnswer.setVisible(true);
						lblNumOfTimesWrong.setVisible(true);
						lblAnswer.setText("Congratulations you got it right!");
						lblNumOfTimesWrong.setText("You guessed wrong: " + WrongCount + " times.");
					}
					else if (userNumber < Num1 || userNumber > Num2) {
						JOptionPane.showMessageDialog(frmDiceGame, "This number is out of range!");
					}
					else {
						lblAnswer.setVisible(true);
						lblAnswer.setText("Wrong number guess again!");
						txtUserGuess.setText("");
						WrongCount++;
					}
					
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(frmDiceGame, "Please enter a valid whole number within range");
				}
				
				
			}
		});
		btnGuess.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuess.setBounds(106, 98, 86, 37);
		frmDiceGame.getContentPane().add(btnGuess);
		
		lblAnswer = new JLabel("Right or Wrong");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnswer.setBounds(10, 167, 370, 20);
		lblAnswer.setVisible(false);
		frmDiceGame.getContentPane().add(lblAnswer);
		
		lblNumOfTimesWrong = new JLabel("You guessed wrong: 0 times");
		lblNumOfTimesWrong.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumOfTimesWrong.setBounds(10, 212, 414, 20);
		lblNumOfTimesWrong.setVisible(false);
		frmDiceGame.getContentPane().add(lblNumOfTimesWrong);
		
		btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				try {
					Num1 = Integer.parseInt(txtNum1.getText());
					Num2 = Integer.parseInt(txtNum2.getText());
					
					if (Num1 < Num2) {
						RandomNumber = RandomNumGen(Num1, Num2);
					}
					else {
						JOptionPane.showMessageDialog(frmDiceGame, "The first number must be smaller than the second");
					}
					
					
				}catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(frmDiceGame, "Please enter valid whole numbers");
				}
			}
		});
		btnGenerate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGenerate.setBounds(276, 35, 89, 23);
		frmDiceGame.getContentPane().add(btnGenerate);
		
		txtUserGuess = new JTextField();
		txtUserGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserGuess.setBounds(10, 98, 86, 37);
		frmDiceGame.getContentPane().add(txtUserGuess);
		txtUserGuess.setColumns(10);
	}

}
