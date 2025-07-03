package org.example;

public class BankAccount implements BankFunctions {
    private int accountNumber;
    private String bankHolderName;
    private int availableBalance;

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
    public String displayInfo() {
        return "";
    }

    @Override
    public int getAccountNumber(String name) {
        return 0;
    }
}
