package sample;
import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.0;
        int option;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check account balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Account balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: ₹" + deposit);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: ₹" + withdraw);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting. Thank you!");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        } while (option != 4);

        sc.close();
    }
}
