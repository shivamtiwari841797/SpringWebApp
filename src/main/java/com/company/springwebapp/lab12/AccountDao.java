package com.company.springwebapp.lab12;

public interface AccountDao {
    void deposit(String accountNumber, int amount) ;
    void withdraw(String accountNumber, int amount) throws Exception;
}
