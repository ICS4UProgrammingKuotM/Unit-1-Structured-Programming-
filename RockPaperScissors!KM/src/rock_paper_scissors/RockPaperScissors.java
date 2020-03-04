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

public class RockPaperScissors {

	private JFrame frmRockPaperScissors;
	private JLabel lblRock;
	private JLabel lblPaper;
	private JLabel lblScissors;
	private JLabel lblcpuRock;
	private JLabel lblcpuPaper;
	private JLabel lblcpuScissors;
	private JLabel 
	private JLabel 
	public Random rdm = new Random();
	
	public int userChoice = 0;
	public int Rock = 1;
	public int Paper = 2;
	public int Scissors = 3;

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
		int RandomNum = rdm.nextInt((3 - 1) + 1) + 1;
		
		for (int i =  0; i < 6; i++) {
			
		}
		
		return RandomNum;
	}
	
	public void WhoWins (int userChoice, int cpuChoice) {
		
		if (userChoice == Rock && cpuChoice == Rock) {
			
		}
		else if (userChoice == Rock && cpuChoice == Paper) {
			
		}
		else if (userChoice == Rock && cpuChoice == Scissors) {
			
		}
		else if (userChoice == Paper && cpuChoice == Rock) {
			
		}
		else if (userChoice == Paper && cpuChoice == Paper) {
			
		}
		else if (userChoice == Paper && cpuChoice == Scissors) {
			
		}
		else if (userChoice == Scissors && cpuChoice == Rock) {
			
		}
		else if (userChoice == Scissors && cpuChoice == Paper) {
			
		}
		else if (userChoice == Scissors && cpuChoice == Scissors) {
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRockPaperScissors = new JFrame();
		frmRockPaperScissors.setTitle("Rock Paper Scissors! KM");
		frmRockPaperScissors.setBounds(100, 100, 693, 617);
		frmRockPaperScissors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRockPaperScissors.getContentPane().setLayout(null);
		ImageIcon Rock = (new ImageIcon(new ImageIcon ("Images/Rock.gif").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
		ImageIcon Paper = (new ImageIcon(new ImageIcon ("Images/Paper.gif").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
		ImageIcon Scissors = (new ImageIcon(new ImageIcon ("Images/Scissors.gif").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
		
		JButton btnRock = new JButton("");
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		lblScissors = new JLabel("");
		lblScissors.setBounds(467, 11, 200, 200);
		lblScissors.setIcon(Scissors);
		frmRockPaperScissors.getContentPane().add(lblScissors);
		
		lblPaper = new JLabel("");
		lblPaper.setBounds(237, 11, 200, 200);
		lblPaper.setIcon(Paper);
		frmRockPaperScissors.getContentPane().add(lblPaper);
		
		lblRock = new JLabel("");
		lblRock.setBounds(10, 11, 200, 200);
		lblRock.setIcon(Rock);
		frmRockPaperScissors.getContentPane().add(lblRock);
		btnRock.setBounds(10, 11, 200, 200);
		frmRockPaperScissors.getContentPane().add(btnRock);
		
		JButton btnPaper = new JButton("");
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPaper.setBounds(237, 11, 200, 200);
		frmRockPaperScissors.getContentPane().add(btnPaper);
		
		JButton btnScissors = new JButton("");
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnScissors.setBounds(467, 11, 200, 200);
		frmRockPaperScissors.getContentPane().add(btnScissors);
		
		lblcpuScissors = new JLabel("");
		lblcpuScissors.setBounds(467, 353, 200, 200);
		frmRockPaperScissors.getContentPane().add(lblcpuScissors);
		
		lblcpuPaper = new JLabel("");
		lblcpuPaper.setBounds(237, 353, 200, 200);
		frmRockPaperScissors.getContentPane().add(lblcpuPaper);
		
		lblcpuRock = new JLabel("");
		lblcpuRock.setBounds(10, 353, 200, 200);
		frmRockPaperScissors.getContentPane().add(lblcpuRock);
	}
}
