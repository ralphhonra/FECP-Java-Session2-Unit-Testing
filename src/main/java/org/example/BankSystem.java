package org.example;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showUserPromptDisplay();
    }

    static void showUserPromptDisplay() {
        int inputtedChoice = 0;
        String returnToMenu = "";

        do {
            displayUserOptions();
            System.out.print("Enter choice (1-5): ");
            inputtedChoice = Integer.parseInt(input.nextLine());

            if (inputtedChoice == 1) {
                createAccount();
            } else if (inputtedChoice == 2) {
                viewAllAccount();
            } else if (inputtedChoice == 3) {
                checkBankBalance();
            } else if (inputtedChoice == 4) {
                depositAmount();
            } else if (inputtedChoice == 5) {

            } else if (inputtedChoice == 6) {
                break;
            }

            System.out.print("Would you like to return to the menu? (yes/no): ");
            returnToMenu = input.nextLine();
        } while (returnToMenu.equalsIgnoreCase("yes"));
    }

    static void depositAmount() {
        System.out.print("Enter your account number: ");
        int inputtedAccountNumber = Integer.parseInt(input.nextLine());
        System.out.print("Enter amount to deposit: ");
        int inputtedAmountToDeposit = Integer.parseInt(input.nextLine());
        System.out.print("Are you sure you want to proceed? (yes/no): ");
        String inputtedChoice = input.next();

        if (inputtedChoice.equalsIgnoreCase("yes")) {
            for (BankAccount bankAccount : bankAccounts) {
                if (bankAccount.getAccountNumber() == inputtedAccountNumber) {
                    bankAccount.setAvailableBalance(bankAccount.getAvailableBalance() + inputtedAmountToDeposit);

                    System.out.println("\nYour balance has been updated successfully!\n");
                }
            }
        } else {
            System.out.println("Transaction cancelled.");
        }
    }

    static void checkBankBalance() {
        System.out.print("Enter account number: ");
        int inputtedAccountNumber = Integer.parseInt(input.nextLine());

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber() == inputtedAccountNumber) {
                bankAccount.displayInfo();
            }
        }
    }

    static void viewAllAccount() {
        for (BankAccount bankAccount : bankAccounts) {
            bankAccount.displayInfo();
        }
    }

    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int inputtedAccountNumber = Integer.parseInt(input.nextLine());
        System.out.print("Enter Holder Name: ");
        String inputtedHolderName = input.nextLine();
        System.out.print("Initial deposit? (yes/no): ");
        String inputtedInitialDepositChoice = input.nextLine();

        int inputtedInitialDepositedAmount = 0;
        if (inputtedInitialDepositChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter initial deposit amount: ");
            inputtedInitialDepositedAmount = Integer.parseInt(input.nextLine());
        }

        bankAccounts.add(
                new BankAccount(
                    inputtedAccountNumber,
                    inputtedHolderName,
                    inputtedInitialDepositedAmount
                )
        );
        System.out.println("Account created successfully!");
    }

    static void displayUserOptions() {
        System.out.println("=== Bank Menu ===");
        System.out.println("1. Create Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. Check Balance");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");
    }
}