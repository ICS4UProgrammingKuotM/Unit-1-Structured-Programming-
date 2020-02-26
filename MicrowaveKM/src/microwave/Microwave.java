package microwave;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.event.MouseInputAdapter;

public class Microwave {

	private JFrame frmMicrowave;
	public JLabel lblFood;
	public JLabel lblFood1;
	public JLabel lblFood2;
	public ImageIcon MicrowaveArt = new ImageIcon("images/MicrowaveArt.png");
	public ImageIcon Pizza = new ImageIcon("images/Pizza.png");
	public ImageIcon Sub = new ImageIcon("images/sandwich.png");
	public ImageIcon Soup = new ImageIcon("images/Soup.png");
	
	public static int count = 0;
	public static boolean PizzaTrue = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Microwave window = new Microwave();
					window.frmMicrowave.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Microwave() {
		initialize();
	}
	
	public double CalculateTotalTime (int mouseClick, boolean checkPizza ) {
		double PizzaTime = 45; 
		double SubTime = 60;
		double SoupTime = 105;
		double TotalTime = 0;
		boolean checkSub = false;
		boolean checkSoup = false;
		
		if (checkPizza = true) {
			if(mouseClick == 1) {
				TotalTime = PizzaTime;
				lblFood.setIcon(Pizza);
				
			}
			else if (mouseClick == 2) {
				TotalTime = PizzaTime * 1.5;
				lblFood.setIcon(Pizza);
				lblFood1.setIcon(Pizza);
			}
			else if (mouseClick == 3) {
				TotalTime = PizzaTime * 2;
				lblFood.setIcon(Pizza);
				lblFood1.setIcon(Pizza);
				lblFood2.setIcon(Pizza);
			}
			else {
				JOptionPane.showMessageDialog(frmMicrowave, "Sorry you can only microwave 3 items at a time!");
			}
		}
		else if (checkSub = true) {
			if(mouseClick == 1) {
				TotalTime = SubTime;
			}
			else if (mouseClick == 2) {
				TotalTime = SubTime * 1.5;
			}
			else if (mouseClick == 3) {
				TotalTime = SubTime * 2;
			}
			else {
				JOptionPane.showMessageDialog(frmMicrowave, "Sorry you can only microwave 3 items at a time!");
			}
		}
		else if (checkSoup = true) {
			if(mouseClick == 1) {
				
			}
			else if (mouseClick == 2) {
			
			}
			else if (mouseClick == 3) {
			
			}
			else {
				JOptionPane.showMessageDialog(frmMicrowave, "Sorry you can only microwave 3 items at a time!");
			}
		}
		
		return TotalTime;
	
		
	}
	
	public void Timer(double Time) {
		
	}
	
	public void Reset() {
		count = 0;
	}
	
	
	
	
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMicrowave = new JFrame();
		frmMicrowave.setTitle("MicrowaveKM");
		frmMicrowave.setBounds(100, 100, 501, 317);
		frmMicrowave.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMicrowave.getContentPane().setLayout(null);
		
		JButton btnSoup = new JButton("Soup");
		btnSoup.setBounds(410, 119, 81, 23);
		frmMicrowave.getContentPane().add(btnSoup);
		
		JButton btnSub = new JButton("Sub");
		btnSub.setBounds(410, 95, 81, 23);
		frmMicrowave.getContentPane().add(btnSub);
		
		JButton btnPizza = new JButton("Pizza");
		btnPizza.setBounds(410, 70, 81, 23);
		btnPizza.addMouseListener(new MouseAdapter(){
		    public void mouseClicked(MouseEvent e){
		        count++;
		        PizzaTrue = true;
		        CalculateTotalTime(count,PizzaTrue);
		    }
		});
		frmMicrowave.getContentPane().add(btnPizza);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(410, 256, 81, 23);
		frmMicrowave.getContentPane().add(btnReset);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(410, 195, 65, 53);
		frmMicrowave.getContentPane().add(btnNewButton);
		
		JLabel lblTotalTime = new JLabel("Total Time");
		lblTotalTime.setBounds(410, 142, 83, 42);
		frmMicrowave.getContentPane().add(lblTotalTime);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(409, 15, 70, 42);
		frmMicrowave.getContentPane().add(lblTime);
		
		JLabel lblMicrowave = new JLabel("");
		lblMicrowave.setIcon(new ImageIcon("N:\\Classes\\Sem2-Winter2020\\ICS4U Programming\\MaKuot (s295215)\\Daily Assignments\\Unit-1-Structured-Programming-\\MicrowaveKM\\images\\MicrowaveArt.png"));
		lblMicrowave.setBounds(0, 0, 491, 279);
		frmMicrowave.getContentPane().add(lblMicrowave);
		
		lblFood = new JLabel("");
		lblFood.setBounds(56, 61, 268, 165);
		frmMicrowave.getContentPane().add(lblFood);
		
		lblFood1 = new JLabel("");
		lblFood1.setBounds(75, 61, 268, 165);
		frmMicrowave.getContentPane().add(lblFood1);
		
		lblFood2 = new JLabel("");
		lblFood2.setBounds(101, 61, 268, 165);
		frmMicrowave.getContentPane().add(lblFood2);
	}
}
