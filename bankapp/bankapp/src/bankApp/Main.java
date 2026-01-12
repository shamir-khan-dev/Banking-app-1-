package bankApp;

import java.util.Scanner;
import bankApp.UserBalance;
import bankApp.UserTransaction;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static UserBalance userBalance = new UserBalance(); // create object
    static UserTransaction userTransaction = new UserTransaction(); // create object

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGINNERS

        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("WELCOME TO THE BANKING PROGRAM");
            System.out.println();
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println();

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> userBalance.showBalance(balance);
                case 2 -> {
                    double depositAmount = userTransaction.deposit();
                    balance += depositAmount;
                    System.out.println("Your new balance is: " + balance);
                }
                case 3 -> {

                    double withDrawAmount = userTransaction.withdraw(balance);
                    balance -= withDrawAmount;
                    System.out.println("Your new balance is: " + balance);
                }
                case 4 -> isRunning = false;

                default -> System.out.println("INVALID CHOICE");

            }

            System.out.println("***************************");
            System.out.println("Thank you! Have a nice day!");
            System.out.println("***************************");

        }

    }
}
