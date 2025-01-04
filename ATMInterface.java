import java.util.*;

public class ATMInterface {
    static Scanner sc = new Scanner(System.in);  
    static Map<Integer, Account> accounts = new HashMap<>(); 

    static class Account {
        int accountNumber;
        int pin;
        double balance;
        List<String> transactionHistory;

        Account(int accountNumber, int pin, double balance) {
            this.accountNumber = accountNumber;
            this.pin = pin;
            this.balance = balance;
            this.transactionHistory = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        accounts.put(12345, new Account(12345, 1234, 5000.00));
        accounts.put(67890, new Account(67890, 6789, 8000.00));

        System.out.println("=== Welcome to the ATM System ===");
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        Account account = accounts.get(accountNumber);
        if (account != null && account.pin == pin) {
            System.out.println("Login Successful! Welcome.");
            atmMenu(account);  // Show ATM menu
        } else {
            System.out.println("Invalid Account Number or PIN. Exiting.");
        }
    }

    static void atmMenu(Account account) {
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:  
                    System.out.println("Current Balance: $" + account.balance);
                    break;
                case 2:  
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    account.balance += deposit;
                    account.transactionHistory.add("Deposited: $" + deposit);
                    System.out.println("Deposit successful!");
                    break;
                case 3:  
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= account.balance) {
                        account.balance -= withdraw;
                        account.transactionHistory.add("Withdrew: $" + withdraw);
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:  
                    System.out.println("Transaction History:");
                    if (account.transactionHistory.isEmpty()) {
                        System.out.println("No transactions found.");
                    } else {
                        for (String transaction : account.transactionHistory) {
                            System.out.println(transaction);
                        }
                    }
                    break;
                case 5:  
                    System.out.println("Thank you for using the ATM! Goodbye.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
