package com.company.springwebapp.lab12;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "account_number")
    private int accountNumber;

    @Column
    private String owner;

    @Column
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
