package Buoi8.service.impl;

import Buoi8.model.Account;
import Buoi8.model.Status;
import Buoi8.service.IAccountService;

import java.util.ArrayList;
import java.util.List;

public class IAccountServiceImpl implements IAccountService {
    private IAuthServiceImpl iAuthServiceimpl = new IAuthServiceImpl();
    private List<Account>   newaccountList = new ArrayList<>();
    @Override
    public List<Account> getAllAccount() {
        for(Account account11:iAuthServiceimpl.getAccountlist()){
            newaccountList.add(account11);
        }
        return newaccountList;
    }

    @Override
    public void createNewAccount(Account account) {
        try{
            for (Account account3:iAuthServiceimpl.getAccountlist()){
                if(account3.getId().equals(account.getId())){
                    throw new Exception("Id da trung vui long nhap lai!!!!");
                }
            }
            iAuthServiceimpl.getAccountlist().add(account);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Account getAccountByUsername(String username) {
        for (Account account4: iAuthServiceimpl.getAccountlist()){
            if(account4.getUsername().equals(username)){
                return account4;
            }
        }
        return null;
    }

    @Override
    public void deleteAccount(String username) {
        for (Account account5:iAuthServiceimpl.getAccountlist()){
            if(account5.getUsername().equals(username)){
                iAuthServiceimpl.getAccountlist().remove(account5);
            }
        }
    }

    @Override
    public void changeStatus(String username, Status status) {
        for (Account account6 :iAuthServiceimpl.getAccountlist()){
            if(account6.getUsername().equals(username)){
                account6.setStatus(status);
            }
        }
    }
}
