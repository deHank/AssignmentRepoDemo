package UI.Windows;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;

public class EditPatientData {

	private JFrame frmEditPatientData;
	private JButton editButton;
	private JTextArea eventsBox;
	private JTextArea notesBox;
	private JTextField idenNum;
	private JTextField roomNum;
	private JTextField PCPBox;
	private JTextField patientName;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditPatientData window = new EditPatientData(args);
					window.frmEditPatientData.setVisible(true);
					window.frmEditPatientData.setLocationRelativeTo(null);
					window.frmEditPatientData.setMinimumSize(new Dimension(450, 450));
					window.frmEditPatientData.setBounds(100, 100, 450, 450);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public EditPatientData(String[] args) {
		initialize(args);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String[] args) {
		frmEditPatientData = new JFrame();
		frmEditPatientData.setVisible(true);
		frmEditPatientData.setResizable(false);
		frmEditPatientData.setLocationRelativeTo(null);
		frmEditPatientData.setTitle("Edit Patient Data");
		frmEditPatientData.getContentPane().setFont(new Font("Cambria", Font.PLAIN, 11));
		frmEditPatientData.setSize(450, 450);
		frmEditPatientData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditPatientData.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 46, 414, 2);
		frmEditPatientData.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Identifier #:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 59, 101, 19);
		frmEditPatientData.getContentPane().add(lblNewLabel);
		
		JLabel lblRoom = new JLabel("Room #:");
		lblRoom.setFont(new Font("Cambria", Font.BOLD, 15));
		lblRoom.setBounds(10, 89, 70, 19);
		frmEditPatientData.getContentPane().add(lblRoom);
		
		JLabel lblPmc = new JLabel("Primary Care Provider:");
		lblPmc.setFont(new Font("Cambria", Font.BOLD, 15));
		lblPmc.setBounds(10, 119, 217, 19);
		frmEditPatientData.getContentPane().add(lblPmc);
		
		JLabel lblEvents = new JLabel("Events:");
		lblEvents.setFont(new Font("Cambria", Font.BOLD, 15));
		lblEvents.setBounds(10, 149, 55, 19);
		frmEditPatientData.getContentPane().add(lblEvents);
		
		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNotes.setBounds(10, 261, 55, 19);
		frmEditPatientData.getContentPane().add(lblNotes);
		
		JButton backButton = new JButton("🔙");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEditPatientData.dispose();
				String[] args2 = updateArgs();
				String[] newArgs = {args[0], args[1], args[2], args[3], args[4], args[5], args2[0], args2[1], args2[2], args2[3], args2[4], args2[5]};
				exitOrNo.main(newArgs);
			}
		});
		backButton.setBounds(6, 6, 30, 30);
		backButton.setMinimumSize(new Dimension (30, 30));
		backButton.setMaximumSize(new Dimension (30, 30));
		frmEditPatientData.getContentPane().add(backButton);
		
		editButton = new JButton("Save And Exit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] newArgs = updateArgs();
				SearchFunction.main(newArgs);
				frmEditPatientData.dispose();
			}
		});
		editButton.setBackground(new Color(255, 255, 255));
		editButton.setBounds(321, 374, 123, 29);
		editButton.setMinimumSize(new Dimension (123, 29));
		editButton.setMaximumSize(new Dimension (123, 29));
		frmEditPatientData.getContentPane().add(editButton);
		
		eventsBox = new JTextArea(args[4]);
		eventsBox.setBounds(10, 180, 434, 63);
		frmEditPatientData.getContentPane().add(eventsBox);
		
		notesBox = new JTextArea(args[5]);
		notesBox.setBounds(10, 292, 434, 63);
		frmEditPatientData.getContentPane().add(notesBox);
		
		idenNum = new JTextField(args[1]);
		idenNum.setBounds(104, 51, 340, 31);
		frmEditPatientData.getContentPane().add(idenNum);
		idenNum.setColumns(10);
		
		roomNum = new JTextField(args[2]);
		roomNum.setColumns(10);
		roomNum.setBounds(79, 84, 365, 31);
		frmEditPatientData.getContentPane().add(roomNum);
		
		PCPBox = new JTextField(args[3]);
		PCPBox.setColumns(10);
		PCPBox.setBounds(191, 116, 253, 31);
		frmEditPatientData.getContentPane().add(PCPBox);
		
		patientName = new JTextField(args[0]);
		patientName.setBounds(42, 0, 402, 41);
		frmEditPatientData.getContentPane().add(patientName);
		patientName.setColumns(10);
	}

	private String[] updateArgs(){
		String[] alteredArgs = new String[6];
		alteredArgs[0] = patientName.getText();
		alteredArgs[1] = idenNum.getText();
		alteredArgs[2] = roomNum.getText();
		alteredArgs[3] = PCPBox.getText();
		alteredArgs[4] = eventsBox.getText();
		alteredArgs[5] = notesBox.getText();

		return alteredArgs;
	}
}
