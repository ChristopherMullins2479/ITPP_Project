package GymPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameEnrty;
	private JTextField passwordEnrty;
	private JLabel lblNewLabel;
	
//global variables 
	public String username;
	public String password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Test");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//get values entered
				username = usernameEnrty.getText();
				password = passwordEnrty.getText();
				
				System.out.println("Username: "+username+"\nPassword: "+password);
				
			}
		});
		btnNewButton.setBounds(212, 329, 134, 21);
		contentPane.add(btnNewButton);
		
		//username entry box
		usernameEnrty = new JTextField();
		usernameEnrty.setBounds(212, 106, 134, 19);
		contentPane.add(usernameEnrty);
		usernameEnrty.setColumns(10);
		
		//password entry box
		passwordEnrty = new JTextField();
		passwordEnrty.setBounds(212, 170, 134, 19);
		contentPane.add(passwordEnrty);
		passwordEnrty.setColumns(10);
		
		//username label
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(134, 109, 68, 13);
		contentPane.add(usernameLabel);
		
		//password label
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(134, 176, 68, 13);
		contentPane.add(passwordLabel);
	}
}
