package TASK3_ATM_INTERFACE;

import java.util.Scanner;

class ATM {
    private BankAccount account;
    private Scanner scanner;

public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
        }

public void displayMenu() {
        System.out.println("Welcome to the ATM Machine!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        }

public void run() {
        boolean running = true;

        while (running) {
        displayMenu();
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
        case 1:
        checkBalance();
        break;
        case 2:
        deposit();
        break;
        case 3:
        withdraw();
        break;
        case 4:
        running = false;
        break;
default:
        System.out.println("Invalid choice. Please try again.");
        }
        }
        }

public void checkBalance() {
        double balance = account.getBalance();
        System.out.println("Your account balance is: $" + balance);
        }

public void deposit() {
        System.out.print("Enter the deposit amount: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposited $" + amount + " into your account.");
        }

public void withdraw() {
        System.out.print("Enter the withdrawal amount: $");
        double amount = scanner.nextDouble();
        boolean success = account.withdraw(amount);

        if (success) {
        System.out.println("Withdrawn $" + amount + " from your account.");
        }
        }

public void close() {
        scanner.close();
        }
        }
