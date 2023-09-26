package TASK3_ATM_INTERFACE;

public class Main {

        public static void main(String[] args) {
            BankAccount userAccount = new BankAccount(1000.0); // Initialize with an initial balance
            ATM atm = new ATM(userAccount);
            atm.run();
            atm.close();
        }
    }

