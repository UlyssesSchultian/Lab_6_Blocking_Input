import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons, mpg, price;

        do {
            System.out.print("Enter gallons of gas in tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            gallons = scanner.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Enter fuel efficiency (mpg): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            mpg = scanner.nextDouble();
        } while (mpg <= 0);

        do {
            System.out.print("Enter price per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            price = scanner.nextDouble();
        } while (price <= 0);

        double costPer100Miles = (100 / mpg) * price;
        double range = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Range with full tank: %.2f miles%n", range);
    }
}