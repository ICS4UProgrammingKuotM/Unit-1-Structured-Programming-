package multi_dimensional_array;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class MultiDimensionalArray {

	private JFrame frmMultiDimArray;
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
		frmMultiDimArray.setBounds(100, 100, 450, 300);
		frmMultiDimArray.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMultiDimArray.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Student", "Assignment 5", "Assignment 4", "Assignment 3", "Assignment 2", "Assignment 1", "Assignment 6", "Final Grade"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(115, 199, 174, -114);
		frmMultiDimArray.getContentPane().add(table);
	}
}
