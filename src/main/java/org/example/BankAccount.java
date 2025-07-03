package org.example;

public class BankAccount implements BankFunctions {
    private int accountNumber;
    private String bankHolderName;
    private int availableBalance;

    public BankAccount() {}

    public BankAccount(int accountNumber, String bankHolderName, int availableBalance) {
        this.accountNumber = accountNumber;
        this.bankHolderName = bankHolderName;
        this.availableBalance = availableBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankHolderName() {
        return bankHolderName;
    }

    public void setBankHolderName(String bankHolderName) {
        this.bankHolderName = bankHolderName;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public void deposit(int addedAmount, int accountNumber) {

    }

    @Override
    public void withdraw(int withdrawAmount, int accountNumber) {

    }

    @Override
    public void displayInfo() {
        System.out.println("\n======================================");
        System.out.println("Account name: " + bankHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: " + availableBalance);
        System.out.println("======================================\n");
    }

    @Override
    public int getAccountNumber(String name) {
        return 0;
    }
}
