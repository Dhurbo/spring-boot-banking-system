package com.example.banking_system_web;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {
    private BankAccount currentAccount;

    public BankAccountService() {
        // Create initial accounts
        BankAccount account1 = new BankAccount("123456", 1000);
        BankAccount account2 = new BankAccount("789012", 500);
        this.currentAccount = account1; // default account
    }

    public void deposit(double amount) {
        currentAccount.deposit(amount);
    }

    public void withdraw(double amount) {
        currentAccount.withdraw(amount);
    }

    public double getBalance() {
        return currentAccount.getBalance();
    }

    public void switchAccount(String accountNumber) {
        if (accountNumber.equals("123456")) {
            this.currentAccount = new BankAccount("123456", 1000);
        } else {
            this.currentAccount = new BankAccount("789012", 500);
        }
    }

    public BankAccount getCurrentAccount() {
        return currentAccount;
    }
}
