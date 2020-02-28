package dice_game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.SwingConstants;

import org.w3c.dom.ranges.Range;

import javafx.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class DiceGame implements ActionListener{

	private JFrame frmDiceGame;
	private JTextField txtNum1;
	private JTextField txtNum2;
	public	JLabel lblNumOfTimesWrong;
	public	JLabel lblAnswer;
	public	JComboBox cboNumGuess;
	private JButton btnGenerate;
	
	
	public int Num1;
	public int Num2;
	public int RandomNumber;
	
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
	
	public int RandomNumGen (int Range1, int Range2) {
		
		List<Integer> Range = IntStream.rangeClosed(Range1,Range2).boxed().collect(Collectors.toList());
		cboNumGuess = new JComboBox(Range.toArray());
		
		int FirstNum = Range.lastIndexOf(FirstNum);
		int LastNum = Ra
		Math.random()
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGenerate) {
			
			try {
				Num1 = Integer.parseInt(txtNum1.getText());
				Num2 = Integer.parseInt(txtNum1.getText());
				
				if (Num1 < Num2) {
					RandomNumGen(Num1, Num2);
				}
				else {
					JOptionPane.showMessageDialog(frmDiceGame, "The first number must be smaller than the second");
				}
				
				
			}catch (Exception e1) {
				JOptionPane.showMessageDialog(frmDiceGame, "Please enter valid whole numbers");
			}
			
			
		}
		
		
	}
	
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiceGame = new JFrame();
		frmDiceGame.setTitle("Dice Game");
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
		
		cboNumGuess = new JComboBox();
		cboNumGuess.setBounds(10, 100, 66, 35);
		frmDiceGame.getContentPane().add(cboNumGuess);
		
		JLabel lblPickGuess = new JLabel("Pick your guess (Between range you inputted)");
		lblPickGuess.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPickGuess.setBounds(10, 67, 370, 20);
		frmDiceGame.getContentPane().add(lblPickGuess);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuess.setBounds(106, 98, 86, 37);
		btnGuess.addActionListener(this);
		frmDiceGame.getContentPane().add(btnGuess);
		
		lblAnswer = new JLabel("Right or Wrong");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnswer.setBounds(10, 167, 370, 20);
		frmDiceGame.getContentPane().add(lblAnswer);
		
		lblNumOfTimesWrong = new JLabel("You guessed wrong: 0 times");
		lblNumOfTimesWrong.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumOfTimesWrong.setBounds(10, 212, 370, 20);
		frmDiceGame.getContentPane().add(lblNumOfTimesWrong);
		
		btnGenerate = new JButton("Generate");
		btnGenerate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGenerate.setBounds(276, 35, 89, 23);
		btnGenerate.addActionListener(this);
		frmDiceGame.getContentPane().add(btnGenerate);
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
