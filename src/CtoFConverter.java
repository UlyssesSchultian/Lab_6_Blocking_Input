import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        do {
            System.out.print("Enter temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard invalid input
            }
            celsius = scanner.nextDouble();
        } while (Double.isNaN(celsius));

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
    }
}