package sample;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(100) + 1;  // Random number between 1 and 100
        int guess;

        System.out.println("🎯 Guess the number (1-100):");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == secret) {
                System.out.println("✅ Correct Guess! The number was " + secret);
                break;  // Exit the loop when correct
            } else if (guess < secret) {
                System.out.println("📉 Too Low! Try again.");
            } else {
                System.out.println("📈 Too High! Try again.");
            }
        }

        sc.close();
    }
}
