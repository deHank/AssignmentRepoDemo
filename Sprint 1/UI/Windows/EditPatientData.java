package UI.Windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JLabel;

public class EditPatientData {

	private JFrame frame;
	private JTextField patientName;
	private JTextField patientNum;
	private JTextField events;
	private JTextField notes;
	private JTextField roomNum;
	private JTextField PCP;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int currentScreenHeight, currentScreenWidth;
		currentScreenHeight = 450;
		currentScreenWidth = 450;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditPatientData window = new EditPatientData();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setMinimumSize(new Dimension(450, 450));

					window.frame.setSize(currentScreenWidth, currentScreenHeight);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditPatientData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Edit Patient Data");
		frame.getContentPane().setFont(new Font("Cambria", Font.PLAIN, 11));
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		patientName = new JTextField();
		patientName.setEditable(false);
		patientName.setFont(new Font("Cambria", Font.BOLD, 25));
		patientName.setBounds(43, 4, 401, 35);
		frame.getContentPane().add(patientName);
		patientName.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 46, 414, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Identifier #:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 59, 101, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRoom = new JLabel("Room #:");
		lblRoom.setFont(new Font("Cambria", Font.BOLD, 15));
		lblRoom.setBounds(10, 89, 70, 19);
		frame.getContentPane().add(lblRoom);
		
		JLabel lblPmc = new JLabel("Primary Care Provider:");
		lblPmc.setFont(new Font("Cambria", Font.BOLD, 15));
		lblPmc.setBounds(10, 119, 217, 19);
		frame.getContentPane().add(lblPmc);
		
		JLabel lblEvents = new JLabel("Events:");
		lblEvents.setFont(new Font("Cambria", Font.BOLD, 15));
		lblEvents.setBounds(10, 149, 55, 19);
		frame.getContentPane().add(lblEvents);
		
		patientNum = new JTextField();
		patientNum.setEditable(false);
		patientNum.setFont(new Font("Cambria", Font.PLAIN, 11));
		patientNum.setBounds(104, 59, 340, 20);
		frame.getContentPane().add(patientNum);
		patientNum.setColumns(10);
		
		events = new JTextField();
		events.setEditable(false);
		events.setFont(new Font("Cambria", Font.PLAIN, 11));
		events.setBounds(10, 179, 434, 71);
		frame.getContentPane().add(events);
		events.setColumns(10);
		
		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNotes.setBounds(10, 261, 55, 19);
		frame.getContentPane().add(lblNotes);
		
		notes = new JTextField();
		notes.setEditable(false);
		notes.setColumns(10);
		notes.setBounds(10, 291, 434, 71);
		frame.getContentPane().add(notes);
		
		roomNum = new JTextField();
		roomNum.setEditable(false);
		roomNum.setFont(new Font("Cambria", Font.PLAIN, 11));
		roomNum.setColumns(10);
		roomNum.setBounds(79, 90, 365, 20);
		frame.getContentPane().add(roomNum);
		
		PCP = new JTextField();
		PCP.setEditable(false);
		PCP.setFont(new Font("Cambria", Font.PLAIN, 11));
		PCP.setColumns(10);
		PCP.setBounds(190, 120, 254, 20);
		frame.getContentPane().add(PCP);
		
		JButton backButton = new JButton("🔙");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				exitOrNo.main(null);
			}
		});
		backButton.setBounds(6, 6, 30, 30);
		frame.getContentPane().add(backButton);
		
		JButton saveAndLeave = new JButton("Save And Leave");
		saveAndLeave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PatientData.main(null);
			}
		});
		saveAndLeave.setBackground(new Color(255, 255, 255));
		saveAndLeave.setBounds(321, 374, 123, 29);
		frame.getContentPane().add(saveAndLeave);
	}

}