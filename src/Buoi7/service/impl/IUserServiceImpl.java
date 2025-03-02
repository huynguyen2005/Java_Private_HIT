package Buoi7.service.impl;

import Buoi7.model.Role;
import Buoi7.model.User;
import Buoi7.service.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IUserServiceImpl implements IUserService {
	Scanner scanner = new Scanner(System.in);
	List<User> userlist = new ArrayList<>();
	private User currentUser;

	public User getCurrentUser() {
		return currentUser;
	}

	public IUserServiceImpl(){
		userlist.add(new User("H110", "Nguyen Van Huy", "huy2005", "1234567", Role.ADMIN));
		userlist.add(new User("H220", "Nguyen Duc Thinh", "thinh2005", "1234567", Role.CUSTOMER));
		currentUser = null;
	}
	@Override
	public void login() {
		System.out.println("-------DANG NHAP------");
		System.out.print("Username: ");
		String username = scanner.nextLine();
		System.out.print("Password: ");
		String password = scanner.nextLine();
		for (User user : userlist) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				currentUser = user;
				System.out.println("Login successfully!!!");
				return;
			}
		}
		System.out.println("Invalid email or password!");
	}

	@Override
	public void logout() {
		if (currentUser!=null){
			System.out.println("Logout successfully");
			currentUser=null;
		}
		else {
			System.out.println("No user is currently logged in!");
		}
	}
}