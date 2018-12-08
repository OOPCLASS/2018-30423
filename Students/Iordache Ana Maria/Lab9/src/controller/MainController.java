package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.UIManager;

import model.User;
import views.LoginView;
import views.RegisterView;

//to do list
//windowbuilder plugin


public class MainController {
	
	private LoginView loginView;
	private RegisterView registerView;
	List<User> usersList = new ArrayList<>();
	User newUser;
	public void start() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		loginView = new LoginView();
		loginView.setVisible(true);
		registerView = new RegisterView();
		
		initializeButtonListeners();
		
		loginView.setVisible(true);
	}
	
	private void initializeButtonListeners() {
		loginView.addLoginButtonActionListener(e -> {
			String username = loginView.getUsername();
			String password = usersList.get(usersList.indexOf(findObject(username))).getPassword().toString();
			String loginPassword = loginView.getPassword();
			if (
					password.equals(loginPassword)) {
					System.out.println("yay");
			}
			else {
				System.out.println("Not a valid user");
				System.out.println((findObject(username)).getPassword().toString());
				showUsers();
			}
		});
		loginView.addNotRegisteredActionListener(e -> {
			loginView.setVisible(false);
			registerView.setVisible(true);
		});
		registerView.addRegisterButtonActionListener(e -> {
			newUser = new User(registerView.getFirstNameField(), 
					registerView.getLastNameField(), 
					registerView.getUsernameTextField(), 
					registerView.getPasswordTextField());
			usersList.add(newUser);
			registerView.setVisible(false);
			loginView.setVisible(true);
		});
	}
	public User findObject(String username) {
		Iterator<User> iterator = usersList.iterator();
		while (iterator.hasNext()) {
			User currentElement = iterator.next();
			//System.out.println("HEEEYYYOOO " + currentElement.getUsername() + currentElement.getPassword());
			if (username.equals(currentElement.getUsername())) {
				return currentElement;
			}
		}
		return null;
	}
	
	public void showUsers() {
		Iterator<User> iterator = usersList.iterator();
		while (iterator.hasNext()) {
			User currentElement = iterator.next();
			System.out.println("user " + currentElement.getUsername() + "\tpassword " + currentElement.getPassword());
		}
	}
}
