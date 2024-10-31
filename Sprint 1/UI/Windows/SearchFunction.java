package UI.Windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;

public class SearchFunction {

	private JFrame frame;
	private JTextField searchBar;
	private JSeparator separator_1;
	private JButton searchButton;
	private JLabel lblAdvanced;
	private JScrollPane scrollPane;
	private JComboBox advList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFunction window = new SearchFunction();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setMinimumSize(new Dimension(435, 345));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchFunction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Search Page");
		frame.setBounds(100, 100, 435, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		searchBar = new JTextField();
		searchBar.setFont(new Font("Cambria", Font.BOLD, 15));
		searchBar.setBounds(107, 5, 259, 32);
		frame.getContentPane().add(searchBar);
		searchBar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Search:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 17));
		lblNewLabel.setBounds(40, 2, 76, 34);
		frame.getContentPane().add(lblNewLabel);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 97, 414, 2);
		frame.getContentPane().add(separator_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 110, 414, 192);
		frame.getContentPane().add(scrollPane);
		frame.revalidate();
		frame.repaint();
		
		searchButton = new JButton("GO");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchButton.setFont(new Font("Cambria", Font.BOLD, 15));
		searchButton.setBounds(367, 22, 57, 43);
		frame.getContentPane().add(searchButton);
		
		lblAdvanced = new JLabel("Advanced:");
		lblAdvanced.setFont(new Font("Cambria", Font.BOLD, 17));
		lblAdvanced.setBounds(40, 43, 106, 34);
		frame.getContentPane().add(lblAdvanced);
		
		String advancedSearchOptions[] = {"Last Name First Name", "Room Number", "Medical Record Number", "Primary Care Provider", "Admission Date"};
		advList = new JComboBox(advancedSearchOptions);
		advList.setFont(new Font("Cambria", Font.BOLD, 15));
		advList.setBounds(129, 45, 233, 34);
		frame.getContentPane().add(advList);
		
		
		JButton backButton = new JButton("🔙");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage.main(null);
				frame.dispose();
			}
		});
		backButton.setBounds(6, 6, 30, 30);
		frame.getContentPane().add(backButton);

		addSearchFunction(searchButton);
	}

	private void addSearchFunction(JButton button){
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				String searchType = (String) advList.getSelectedItem();
				String searchParam = searchBar.getText();
				//TODO
				//String names[] = function(searchType, searchParam);
				String tempNames[] = {"Doe John", "Doe John"};
				populateScrollPane(tempNames);
            }
        });
	}

	private void addGetPatientDataFunction(JButton button){
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				//TODO
				//String patientData[] = function(button.getText());
				String tempPatientData[] = {"Doe John", "1110001111", "121", "Jacob Alexander", "", ""};
				PatientData.main(tempPatientData);
				frame.dispose();
            }
        });
	}

	private void populateScrollPane(String names[]){
		for(String name : names){
			// String firstNameLastName[] = name.split(" ");
			JButton button = new JButton(name);
			button.setBounds(50, 50, 50, 50);
			addGetPatientDataFunction(button);
			this.scrollPane.add(button);
		}
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		frame.revalidate();
		frame.repaint();
		frame.pack();
	}
}
