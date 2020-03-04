package rock_paper_scissors;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RockPaperScissors {

	private JFrame frmRockPaperScissors;
	private JLabel lblRock;
	private JLabel lblPaper;
	private JLabel lblScissors;
	private JLabel lblcpuRock;
	private JLabel lblcpuPaper;
	private JLabel lblcpuScissors;
	private JLabel lbluserScore;
	private JLabel lblcpuScore;
	private JLabel lblWhoWins;
	private JButton btnRock;
	private JButton btnPaper;
	private JButton btnScissors;
	public Random rdm = new Random();
	public ImageIcon RockIcon = (new ImageIcon(new ImageIcon ("Images/Rock.gif").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
	public ImageIcon PaperIcon = (new ImageIcon(new ImageIcon ("Images/Paper.gif").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
	public ImageIcon ScissorsIcon = (new ImageIcon(new ImageIcon ("Images/Scissors.gif").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
	public ImageIcon RockWin = (new ImageIcon(new ImageIcon ("Images/RockWin.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon RockTie = (new ImageIcon(new ImageIcon ("Images/TieRock.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon RockLose = (new ImageIcon(new ImageIcon ("Images/RockLose.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon PaperWin = (new ImageIcon(new ImageIcon ("Images/PaperWin.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon PaperTie = (new ImageIcon(new ImageIcon ("Images/TiePaper.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon PaperLose = (new ImageIcon(new ImageIcon ("Images/LosePaper.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon ScissorsWin = (new ImageIcon(new ImageIcon ("Images/ScissorsWin.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon ScissorsTie = (new ImageIcon(new ImageIcon ("Images/TieScissors.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	public ImageIcon ScissorsLose = (new ImageIcon(new ImageIcon ("Images/ScissorsLose.gif").getImage().getScaledInstance(655, 525, Image.SCALE_DEFAULT)));
	
	int userChoice = 0;
	public int Rock = 1;
	public int Paper = 2;
	public int Scissors = 3;
	public int userScore = 0;
	public int cpuScore = 0;
	private JLabel lblWinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissors window = new RockPaperScissors();
					window.frmRockPaperScissors.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RockPaperScissors() {
		initialize();
	}
	public int cpuChoiceGen () {
		int cpuChoice = rdm.nextInt((3 - 1) + 1) + 1;
		
		if (cpuChoice == Rock) {
			lblcpuPaper.setVisible(false);
			lblcpuScissors.setVisible(false);
		}
		else if (cpuChoice == Paper) {
			lblcpuRock.setVisible(false);
			lblcpuScissors.setVisible(false);
		}
		else if (cpuChoice == Scissors) {
			lblcpuRock.setVisible(false);
			lblcpuPaper.setVisible(false);
		}
		
		
		return cpuChoice;
		
	}
	
	public void WhoWins (int userChoice, int cpuChoice) {
		
		if (userChoice == Rock && cpuChoice == Rock) {
			lblRock.setVisible(false);
			lblcpuRock.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(RockTie);
			
			lblWinner.setText("It's a tie");
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
			
		}
		else if (userChoice == Rock && cpuChoice == Paper) {
			lblRock.setVisible(false);
			lblcpuPaper.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(RockLose);
			
			lblWinner.setText("The Computer wins!");
			
			cpuScore++;
			
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
		else if (userChoice == Rock && cpuChoice == Scissors) {
			lblRock.setVisible(false);
			lblcpuScissors.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(RockWin);
			
			lblWinner.setText("You win!");
			
			userScore++;
			
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
		else if (userChoice == Paper && cpuChoice == Rock) {
			lblPaper.setVisible(false);
			lblcpuRock.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(PaperWin);
			
			lblWinner.setText("You win!");
			
			userScore++;
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
		else if (userChoice == Paper && cpuChoice == Paper) {
			lblPaper.setVisible(false);
			lblcpuPaper.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(PaperTie);
			
			lblWinner.setText("It's a tie");
			
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
		else if (userChoice == Paper && cpuChoice == Scissors) {
			lblPaper.setVisible(false);
			lblcpuScissors.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(PaperLose);
			
			lblWinner.setText("The Computer wins!");
			
			cpuScore++;
			
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
		else if (userChoice == Scissors && cpuChoice == Rock) {
			lblScissors.setVisible(false);
			lblcpuRock.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(ScissorsLose);
			
			lblWinner.setText("The Computer wins!");
			
			cpuScore++;
			
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
		else if (userChoice == Scissors && cpuChoice == Paper) {
			lblScissors.setVisible(false);
			lblcpuPaper.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(ScissorsWin);
			
			lblWinner.setText("You win!");
			
			userScore++;
			
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
		else if (userChoice == Scissors && cpuChoice == Scissors) {
			lblScissors.setVisible(false);
			lblcpuScissors.setVisible(false);
			lblWinner.setVisible(true);
			lblWhoWins.setVisible(true);
			
			lblWhoWins.setIcon(ScissorsTie);
			
			lblWinner.setText("It's a tie");
			lblcpuScore.setText("The Computer's score is: " + cpuScore);
			lbluserScore.setText("Your score is: " + userScore);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRockPaperScissors = new JFrame();
		frmRockPaperScissors.setTitle("Rock Paper Scissors! KM");
		frmRockPaperScissors.setBounds(100, 100, 690, 594);
		frmRockPaperScissors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRockPaperScissors.getContentPane().setLayout(null);
		
		
		JButton btnRock = new JButton("");
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblPaper.setVisible(false);
				lblScissors.setVisible(false);
				btnRock.setVisible(false);
				btnPaper.setVisible(false);
				btnScissors.setVisible(false);
				int userChoice = 1;
				int cpuChoice = cpuChoiceGen();
				WhoWins(userChoice, cpuChoice);
			}
		});
		
		lblScissors = new JLabel("");
		lblScissors.setBounds(467, 11, 200, 200);
		lblScissors.setIcon(ScissorsIcon);
		frmRockPaperScissors.getContentPane().add(lblScissors);
		
		lblPaper = new JLabel("");
		lblPaper.setBounds(237, 11, 200, 200);
		lblPaper.setIcon(PaperIcon);
		frmRockPaperScissors.getContentPane().add(lblPaper);
		
		lblRock = new JLabel("");
		lblRock.setBounds(10, 11, 200, 200);
		lblRock.setIcon(RockIcon);
		frmRockPaperScissors.getContentPane().add(lblRock);
		btnRock.setBounds(10, 11, 200, 200);
		frmRockPaperScissors.getContentPane().add(btnRock);
		
		btnPaper = new JButton("");
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRock.setVisible(false);
				lblScissors.setVisible(false);
				btnRock.setVisible(false);
				btnPaper.setVisible(false);
				btnScissors.setVisible(false);
				int userChoice = 2;
				int cpuChoice = cpuChoiceGen();
				WhoWins(userChoice, cpuChoice);
			}
		});
		btnPaper.setBounds(237, 11, 200, 200);
		frmRockPaperScissors.getContentPane().add(btnPaper);
		
		btnScissors = new JButton("");
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRock.setVisible(false);
				lblPaper.setVisible(false);
				btnRock.setVisible(false);
				btnPaper.setVisible(false);
				btnScissors.setVisible(false);
				int userChoice = 3;
				int cpuChoice = cpuChoiceGen();
				WhoWins(userChoice, cpuChoice);
			}
		});
		btnScissors.setBounds(467, 11, 200, 200);
		frmRockPaperScissors.getContentPane().add(btnScissors);
		
		lblcpuScissors = new JLabel("");
		lblcpuScissors.setBounds(467, 334, 200, 200);
		lblcpuScissors.setIcon(ScissorsIcon);
		frmRockPaperScissors.getContentPane().add(lblcpuScissors);
		
		lblcpuPaper = new JLabel("");
		lblcpuPaper.setBounds(237, 334, 200, 200);
		lblcpuPaper.setIcon(PaperIcon);
		frmRockPaperScissors.getContentPane().add(lblcpuPaper);
		
		lblcpuRock = new JLabel("");
		lblcpuRock.setBounds(10, 334, 200, 200);
		lblcpuRock.setIcon(RockIcon);
		frmRockPaperScissors.getContentPane().add(lblcpuRock);
		
		lbluserScore = new JLabel("Your score is:");
		lbluserScore.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbluserScore.setBounds(10, 235, 241, 34);
		frmRockPaperScissors.getContentPane().add(lbluserScore);
		
		lblcpuScore = new JLabel("The Computer's score is:");
		lblcpuScore.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblcpuScore.setBounds(10, 280, 266, 34);
		frmRockPaperScissors.getContentPane().add(lblcpuScore);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRock.setVisible(true);
				lblPaper.setVisible(true);
				lblScissors.setVisible(true);
				lblRock.setIcon(RockIcon);
				lblPaper.setIcon(PaperIcon);
				lblScissors.setIcon(ScissorsIcon);
				
				lblcpuRock.setVisible(true);
				lblcpuPaper.setVisible(true);
				lblcpuScissors.setVisible(true);
				lblcpuRock.setIcon(RockIcon);
				lblcpuPaper.setIcon(PaperIcon);
				lblcpuScissors.setIcon(ScissorsIcon);
				
				lblWhoWins.setVisible(false);
				lblWinner.setVisible(false);
				
				btnRock.setVisible(true);
				btnPaper.setVisible(true);
				btnScissors.setVisible(true);
			}
		});
		
		lblWinner = new JLabel("Winner");
		lblWinner.setVisible(false);
		lblWinner.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWinner.setBounds(275, 252, 225, 34);
		frmRockPaperScissors.getContentPane().add(lblWinner);
		btnPlayAgain.setBounds(510, 246, 154, 48);
		frmRockPaperScissors.getContentPane().add(btnPlayAgain);
		
		lblWhoWins = new JLabel("");
		lblWhoWins.setBounds(10, 11, 655, 525);
		frmRockPaperScissors.getContentPane().add(lblWhoWins);
	}
}
