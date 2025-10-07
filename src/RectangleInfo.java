import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;

        do {
            System.out.print("Enter width: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            width = scanner.nextDouble();
        } while (width <= 0);

        do {
            System.out.print("Enter height: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}