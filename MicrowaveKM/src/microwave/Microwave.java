package microwave;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Microwave implements ActionListener{

	private JFrame frmMicrowave;
	public JLabel lblFood;
	public JLabel lblFood1;
	public JLabel lblFood2;
	public JLabel lblTotalTimeANS;
	public JLabel lblTime;
	public JButton btnPizza;
	public JButton btnSub;
	public JButton btnSoup;
	public JButton btnStart;
	public JButton btnReset;
	public ImageIcon MicrowaveArt = new ImageIcon("images/MicrowaveArt.png");
	public ImageIcon Pizza = new ImageIcon("images/Pizza.png");
	public ImageIcon Sub = new ImageIcon("images/sandwich.png");
	public ImageIcon Soup = new ImageIcon("images/Soup.png");
	
	public static int count = 0;
	public static double Time;
	public static String whatFood = "";
	
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
	
	public double CalculateTotalTime (int mouseClick,String checkItem) {
		double PizzaTime = 45; 
		double SubTime = 60;
		double SoupTime = 105;
		double TotalTime = 0;
		
		
		if (checkItem == "Pizza") {
			if(mouseClick == 1) {
				TotalTime = PizzaTime;
				lblFood.setIcon(Pizza);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else if (mouseClick == 2) {
				TotalTime = PizzaTime * 1.5;
				lblFood.setIcon(Pizza);
				lblFood1.setIcon(Pizza);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else if (mouseClick == 3) {
				TotalTime = PizzaTime * 2;
				lblFood.setIcon(Pizza);
				lblFood1.setIcon(Pizza);
				lblFood2.setIcon(Pizza);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else {
				JOptionPane.showMessageDialog(frmMicrowave, "Sorry you can only microwave 3 items at a time!");
			}
		}
		else if (checkItem == "Sub") {
			if(mouseClick == 1) {
				TotalTime = SubTime;
				lblFood.setIcon(Sub);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else if (mouseClick == 2) {
				TotalTime = SubTime * 1.5;
				lblFood.setIcon(Sub);
				lblFood1.setIcon(Sub);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else if (mouseClick == 3) {
				TotalTime = SubTime * 2;
				lblFood.setIcon(Sub);
				lblFood1.setIcon(Sub);
				lblFood2.setIcon(Sub);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else {
				JOptionPane.showMessageDialog(frmMicrowave, "Sorry you can only microwave 3 items at a time!");
			}
		}
		else if (checkItem == "Soup") {
			if(mouseClick == 1) {
				TotalTime = SoupTime;
				lblFood.setIcon(Soup);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else if (mouseClick == 2) {
				TotalTime = SoupTime * 1.5;
				lblFood.setIcon(Soup);
				lblFood1.setIcon(Soup);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else if (mouseClick == 3) {
				TotalTime = SoupTime * 2;
				lblFood.setIcon(Soup);
				lblFood1.setIcon(Soup);
				lblFood2.setIcon(Soup);
				lblTotalTimeANS.setText(TotalTime + " seconds");
			}
			else {
				JOptionPane.showMessageDialog(frmMicrowave, "Sorry you can only microwave 3 items at a time!");
			}
		}
		
		return TotalTime;
	
		
	}
	
	public void Timer(double cookTime) {
		double Time = cookTime;
		
	}
	
	public void Reset() {
		count = 0;
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnPizza) {
			  count++;
		       btnSoup.setEnabled(false);
		       btnSub.setEnabled(false);
		       whatFood = "Pizza";
		       Time = CalculateTotalTime(count,whatFood);
		}
		else if (e.getSource() == btnSub) {
			count++;
	        btnSoup.setEnabled(false);
	        btnPizza.setEnabled(false);
	        whatFood = "Sub";
	        Time = CalculateTotalTime(count,whatFood);
		}
		else if (e.getSource() == btnSoup) {
			count++;
	        btnSub.setEnabled(false);
	        btnPizza.setEnabled(false);
	        whatFood = "Soup";
	        Time = CalculateTotalTime(count,whatFood);
		}
		else if (e.getSource() == btnStart) {
			Timer(Time);
		}
		else if (e.getSource() == btnReset) {
			count = 0;
			btnPizza.setEnabled(true);
			btnSub.setEnabled(true);
			btnSoup.setEnabled(true);
			lblFood.setIcon(null);
			lblFood1.setIcon(null);
			lblFood2.setIcon(null);
			lblTotalTimeANS.setText("");
		}
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
		
		btnSoup = new JButton("Soup");
		btnSoup.setBounds(410, 119, 81, 23);
		btnSoup.addActionListener(this);
		frmMicrowave.getContentPane().add(btnSoup);
		
		btnSub = new JButton("Sub");
		btnSub.setBounds(410, 95, 81, 23);
		btnSub.addActionListener(this);
		frmMicrowave.getContentPane().add(btnSub);
		
		btnPizza = new JButton("Pizza");
		btnPizza.setBounds(410, 70, 81, 23);
		btnPizza.addActionListener(this);
		frmMicrowave.getContentPane().add(btnPizza);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(410, 256, 81, 23);
		btnReset.addActionListener(this);
		frmMicrowave.getContentPane().add(btnReset);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(410, 195, 65, 53);
		btnStart.addActionListener(this);
		frmMicrowave.getContentPane().add(btnStart);
		
		lblTotalTimeANS = new JLabel("");
		lblTotalTimeANS.setBounds(400, 165, 83, 32);
		frmMicrowave.getContentPane().add(lblTotalTimeANS);
		
		JLabel lblTotalTime = new JLabel("Total Time:");
		lblTotalTime.setBounds(410, 142, 65, 32);
		frmMicrowave.getContentPane().add(lblTotalTime);
		
		lblTime = new JLabel("Time");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(409, 15, 70, 42);
		frmMicrowave.getContentPane().add(lblTime);
		
		JLabel lblMicrowave = new JLabel("");
		lblMicrowave.setBounds(0, 0, 491, 279);
		lblMicrowave.setIcon(MicrowaveArt);
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
