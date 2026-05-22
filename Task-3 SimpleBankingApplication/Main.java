import java.util.Scanner;

class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: ₹" + amount);
        }
    }

    // Check Balance Method
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create bank account with initial balance
        BankAccount account = new BankAccount(1000);

        int choice;

        do {
            System.out.println("\n===== Simple Banking System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the Banking System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
