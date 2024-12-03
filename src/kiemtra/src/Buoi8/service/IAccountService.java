package Buoi8.service;

import Buoi8.model.Account;
import Buoi8.model.Status;

import java.util.List;

public interface IAccountService {
    public List<Account> getAllAccount();
    public void createNewAccount(Account account);
    public Account getAccountByUsername(String username);
    public void deleteAccount(String username);
    public void changeStatus(String username, Status status);
}
