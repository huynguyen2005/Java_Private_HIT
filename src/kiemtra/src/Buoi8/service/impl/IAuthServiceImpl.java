package Buoi8.service.impl;

import Buoi8.model.Account;
import Buoi8.model.Address;
import Buoi8.model.Role;
import Buoi8.model.Status;
import Buoi8.service.IAuthService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IAuthServiceImpl implements IAuthService {
    private List<Account> accountlist = new ArrayList<>();
    Account currentaccount;

    public List<Account> getAccountlist() {
        return accountlist;
    }

    public Account getCurrentaccount() {
        return currentaccount;
    }

    public IAuthServiceImpl(){
        accountlist.add(new Account("M101", "Nguyen Van Huy", 19, new Address("Dan Phuong","Ha Noi"), "13/5/2005", "huy2005","1234567", Role.ADMIN, Status.ACTIVE));
        accountlist.add(new Account("M102", "Nguyen Van Manh", 19, new Address("Dan Phuong","Ha Nam"), "10/5/2005", "manh2005","1234567", Role.USER, Status.ACTIVE));
        accountlist.add(new Account("M103", "Nguyen The Vinh", 19, new Address("Dan Phuong","Ha Noi"), "19/4/2005", "vinh2005","1234567", Role.ADMIN, Status.BAN));
        accountlist.add(new Account("M104", "Nguyen Duc Thinh", 19, new Address("Dan Phuong","Dien Bien Phu"), "27/7/2005", "thinh2005","1234567", Role.USER, Status.BAN));
        currentaccount = null;
    }
    @Override
    public void login(Scanner scanner) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        for (Account account1:accountlist){
            if(account1.getUsername().equals(username)&&account1.getPassword().equals(password)){
                currentaccount = account1;
                System.out.println("Login successfully");
            }
        }
    }

    @Override
    public void logout() {
        if(currentaccount!=null){
            System.out.println("Logout successfully");
            currentaccount = null;
        }
        else {
            System.out.println("Invalid!!!");
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        for(Account account2:accountlist){
            if(account2.getUsername().equals(username)&&account2.getPassword().equals(oldPassword)){
                account2.setPassword(newPassword);
            }
        }
    }
}
