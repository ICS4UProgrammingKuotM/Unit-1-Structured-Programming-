package microwave;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Microwave {

	private JFrame frmMicrowave;
	
	public static ImageIcon MicrowaveArt = new ImageIcon();
	
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
		MicrowaveArt.
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
		
		JLabel lblMicrowave = new JLabel("");
		lblMicrowave.setIcon(new ImageIcon("images/MicrowaveArt.png"));
		lblMicrowave.setBounds(0, 0, 491, 279);
		frmMicrowave.getContentPane().add(lblMicrowave);
		
		JLabel lblFood = new JLabel("");
		lblFood.setIcon(MicrowaveArt);
		lblFood.setBounds(56, 61, 268, 165);
		frmMicrowave.getContentPane().add(lblFood);
	}
}
