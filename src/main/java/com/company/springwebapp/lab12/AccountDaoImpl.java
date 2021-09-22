package com.company.springwebapp.lab12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Optional;

@Repository
public class AccountDaoImpl implements  AccountDao{

    @Autowired
    private AccountRepo accountRepo;

    @Override
    public void deposit(String accountNumber, int amount) {

        Optional<Account> accountOptional = accountRepo.findById(Integer.parseInt(accountNumber));
        if(accountOptional.isPresent()) {
            Account account = accountOptional.get();
            account.setBalance(account.getBalance() + amount);
            accountRepo.save(account);
        } else {
            throw new RuntimeException("A/c not found");
        }
    }

    @Override
    public void withdraw(String accountNumber, int amount) throws Exception {

        Optional<Account> accountOptional = accountRepo.findById(Integer.parseInt(accountNumber));
        if(accountOptional.isPresent()) {
            Account account = accountOptional.get();
            if(amount > account.getBalance()) {
                throw new Exception("Insufficient Balance!!!");
            } else {
                account.setBalance(account.getBalance() - amount);
                accountRepo.save(account);
            }
        } else {
            throw new Exception("A/c not found");
        }
    }
}
