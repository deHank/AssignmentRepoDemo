package UI.Windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class PatientData {

	private JFrame frame;
	private JTextField patientName;
	private JTextField patientNum;
	private JTextField events;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtDfrhgdh;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientData window = new PatientData();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Cambria", Font.PLAIN, 11));
		frame.setBounds(100, 100, 447, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		patientName = new JTextField();
		patientName.setEditable(false);
		patientName.setFont(new Font("Cambria", Font.BOLD, 25));
		patientName.setBounds(10, 0, 414, 35);
		frame.getContentPane().add(patientName);
		patientName.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 46, 414, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Identifier #:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 59, 88, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRoom = new JLabel("Room #:");
		lblRoom.setFont(new Font("Cambria", Font.BOLD, 15));
		lblRoom.setBounds(10, 89, 61, 19);
		frame.getContentPane().add(lblRoom);
		
		JLabel lblPmc = new JLabel("Primary Care Provider:");
		lblPmc.setFont(new Font("Cambria", Font.BOLD, 15));
		lblPmc.setBounds(10, 119, 167, 19);
		frame.getContentPane().add(lblPmc);
		
		JLabel lblEvents = new JLabel("Events:");
		lblEvents.setFont(new Font("Cambria", Font.BOLD, 15));
		lblEvents.setBounds(10, 149, 55, 19);
		frame.getContentPane().add(lblEvents);
		
		patientNum = new JTextField();
		patientNum.setFont(new Font("Cambria", Font.PLAIN, 11));
		patientNum.setEditable(false);
		patientNum.setBounds(95, 59, 329, 20);
		frame.getContentPane().add(patientNum);
		patientNum.setColumns(10);
		
		events = new JTextField();
		events.setFont(new Font("Cambria", Font.PLAIN, 11));
		events.setBounds(10, 179, 414, 71);
		frame.getContentPane().add(events);
		events.setColumns(10);
		
		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNotes.setBounds(10, 261, 55, 19);
		frame.getContentPane().add(lblNotes);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 291, 414, 71);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria", Font.PLAIN, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(73, 90, 351, 20);
		frame.getContentPane().add(textField_1);
		
		txtDfrhgdh = new JTextField();
		txtDfrhgdh.setFont(new Font("Cambria", Font.PLAIN, 11));
		txtDfrhgdh.setColumns(10);
		txtDfrhgdh.setBounds(174, 120, 250, 20);
		frame.getContentPane().add(txtDfrhgdh);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Cambria", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(63, 150, 361, 20);
		frame.getContentPane().add(textField_3);
	}

}
