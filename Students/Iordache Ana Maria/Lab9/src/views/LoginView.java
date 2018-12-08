package views;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame{
 
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JButton loginButton;
	private JButton notRegisteredButton;
	
	public LoginView() {
		this.setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(114, 32, 84, 14);
		getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(114, 70, 84, 14);
		getContentPane().add(passwordLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(80, 50, 120, 20);
		getContentPane().add(usernameTextField);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(80, 90, 120, 20);
		getContentPane().add(passwordTextField);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(140, 120, 60, 30);
		getContentPane().add(loginButton);
		
		notRegisteredButton = new JButton("Not Registered?");
		notRegisteredButton.setBounds(80, 160, 120, 30);
		getContentPane().add(notRegisteredButton);
		
	}
	public void addLoginButtonActionListener(final ActionListener actionListener) {
		loginButton.addActionListener(actionListener);
	}
	
	public void addNotRegisteredActionListener(final ActionListener actionListener) {
		notRegisteredButton.addActionListener(actionListener);
	}
	
	public String getUsername() {
		return usernameTextField.getText();
	}
	
	public String getPassword() {
		return passwordTextField.getPassword().toString();
	}
}
