package bankApp;

import java.util.Scanner;

public class UserTransaction {

    static Scanner scanner = new Scanner(System.in);

    static double deposit(){

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        
        while(!scanner.hasNextDouble()){
            System.out.println("Please enter a number: ");
            scanner.next(); // discard invalid input

        }

        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to be withdrawn: ");

        while(!scanner.hasNextDouble()){
            System.out.println("Please enter a number: ");
            scanner.next(); // discard invalid input

        }

        amount = scanner.nextDouble();


        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

}
