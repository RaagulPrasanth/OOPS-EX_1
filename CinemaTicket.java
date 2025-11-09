package sample;
import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double BASE_TICKET = 200.0;
        double finalPrice = BASE_TICKET;

        
        System.out.print("Enter your age: ");
        int age = s.nextInt();

        // Input day of booking (1=Monday ... 7=Sunday)
        System.out.print("Enter the day of booking (1=Monday ... 7=Sunday): ");
        int day = s.nextInt();

        // Apply age-based discount
        if (age < 5) {
            finalPrice = 0;
            System.out.println("The ticket is free for children under 5.");
        } 
        else if (age >= 5 && age <= 18) {
            System.out.println("You are eligible for a 40% discount based on age.");
            finalPrice -= finalPrice * 0.40;
        } 
        else if (age > 60) {
            System.out.println("You are eligible for a 30% discount based on age.");
            finalPrice -= finalPrice * 0.30;
        } 
        else {
            System.out.println("No age-based discount applied.");
        }

        // Apply day-based discount (Monday–Friday)
        if (day >= 1 && day <= 5 && finalPrice > 0) {
            System.out.println("You are eligible for a 10% weekday discount.");
            finalPrice -= finalPrice * 0.10;
        }

        // Display final price
        System.out.println("------------------------------");
        System.out.printf("Final Ticket Price: ₹%.2f%n", finalPrice);
        System.out.println("------------------------------");

        s.close();
    }
}
