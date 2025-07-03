package org.example;

public interface BankFunctions {
    void deposit(int addedAmount, int accountNumber);
    void withdraw(int withdrawAmount, int accountNumber);
    void displayInfo();
    int getAccountNumber(String name);
}
