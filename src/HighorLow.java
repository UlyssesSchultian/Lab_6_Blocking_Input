import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(10) + 1;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            guess = scanner.nextInt();
        } while (guess < 1 || guess > 10);

        System.out.println("Random number was: " + target);
        if (guess < target) {
            System.out.println("Too low!");
        } else if (guess > target) {
            System.out.println("Too high!");
        } else {
            System.out.println("On the money!");
        }
    }
}