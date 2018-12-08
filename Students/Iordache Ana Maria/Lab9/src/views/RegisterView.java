package views;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterView extends JFrame{

	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JButton registerButton;

	public RegisterView() {
		this.setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(80, 32, 84, 14);
		getContentPane().add(firstNameLabel);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(80, 50, 120, 20);
		getContentPane().add(firstNameField);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(80, 70, 84, 14);
		getContentPane().add(lastNameLabel);
		
		lastNameField = new JTextField();
		lastNameField.setBounds(80, 90, 120, 20);
		getContentPane().add(lastNameField);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(80, 110, 84, 14);
		getContentPane().add(usernameLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(80, 130, 120, 20);
		getContentPane().add(usernameTextField);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(80, 150, 84, 14);
		getContentPane().add(passwordLabel);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(80, 170, 120, 20);
		getContentPane().add(passwordTextField);
		
		registerButton = new JButton("Register");
		registerButton.setBounds(80, 190, 60, 30);
		getContentPane().add(registerButton);
		
	}
	public void addRegisterButtonActionListener(final ActionListener actionListener) {
		registerButton.addActionListener(actionListener);
	}
	public String getFirstNameField() {
		return firstNameField.getText();
	}
	public String getUsernameTextField() {
		return usernameTextField.getText();
	}
	public void setUsernameTextField(JTextField usernameTextField) {
		this.usernameTextField = usernameTextField;
	}
	public void setFirstNameField(JTextField firstNameField) {
		this.firstNameField = firstNameField;
	}
	public String getLastNameField() {
		return lastNameField.getText();
	}
	public void setLastNameField(JTextField lastNameField) {
		this.lastNameField = lastNameField;
	}
	public String getPasswordTextField() {
		return passwordTextField.getPassword().toString();
	}
	public void setPasswordTextField(JPasswordField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	
	
}
