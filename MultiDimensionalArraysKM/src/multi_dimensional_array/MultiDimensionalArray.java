package multi_dimensional_array;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiDimensionalArray {

	private JFrame frmMultiDimArray;
	private JTextField txtName1;
	private JTextField txtName4;
	private JTextField txtName2;
	private JTextField txtName3;
	
	private String name1 = "";
	private String name2 = "";
	private String name3 = "";
	private String name4 = "";
	private JTable tblGrades;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiDimensionalArray window = new MultiDimensionalArray();
					window.frmMultiDimArray.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MultiDimensionalArray() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMultiDimArray = new JFrame();
		frmMultiDimArray.setTitle("Multi Dimensional Array KM");
		frmMultiDimArray.setBounds(100, 100, 638, 423);
		frmMultiDimArray.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMultiDimArray.getContentPane().setLayout(null);
		
		JLabel lblClassAvg = new JLabel("New label");
		lblClassAvg.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblClassAvg.setBounds(10, 349, 414, 27);
		frmMultiDimArray.getContentPane().add(lblClassAvg);
		
		JLabel lblEnterName = new JLabel("Enter students first names");
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterName.setBounds(10, 0, 414, 27);
		frmMultiDimArray.getContentPane().add(lblEnterName);
		
		txtName1 = new JTextField();
		txtName1.setBounds(10, 38, 147, 20);
		frmMultiDimArray.getContentPane().add(txtName1);
		txtName1.setColumns(10);
		
		txtName2 = new JTextField();
		txtName2.setColumns(10);
		txtName2.setBounds(167, 38, 147, 20);
		frmMultiDimArray.getContentPane().add(txtName2);
		
		txtName3 = new JTextField();
		txtName3.setColumns(10);
		txtName3.setBounds(340, 38, 125, 20);
		frmMultiDimArray.getContentPane().add(txtName3);
		
		txtName4 = new JTextField();
		txtName4.setColumns(10);
		txtName4.setBounds(475, 38, 125, 20);
		frmMultiDimArray.getContentPane().add(txtName4);
		
		JButton btnGetAvg = new JButton("Get Class Average");
		btnGetAvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name1 = txtName1.getText();
				name2 = txtName2.getText();
				name3 = txtName3.getText();
				name4 = txtName4.getText();
			}
		});
		btnGetAvg.setBounds(212, 69, 125, 38);
		frmMultiDimArray.getContentPane().add(btnGetAvg);
	}
}
