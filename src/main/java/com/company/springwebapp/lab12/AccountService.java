package com.company.springwebapp.lab12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void deposit(String accountNumber, int amount)  {
        accountDao.deposit(accountNumber, amount);
    }

    public void withdraw(String accountNumber, int amount) throws Exception {
        accountDao.withdraw(accountNumber, amount);
    }
}
