import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prints this to tell the user options he or she has to choose from
        System.out.println("What kind of conversion would you like to make?");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        // Here the user is clearly prompted to choose one of the two numbers and the user input is taken.
        System.out.print("Enter your choice (1 or 2): ");
        byte input = scanner.nextByte(); // Read user choice

        // Conditional statements that evaluates the user input, matches it with the right block of code and executes.
        if (input == 1) {
            // Celsius to Fahrenheit
            System.out.print("Enter the temperature in degree Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (9.0 / 5.0) * celsius + 32; // Use floating-point division
            System.out.println(celsius + "degree Celsius is equivalent to " + fahrenheit + "Fahrenhet.");

        } else if (input == 2) {
            // Fahrenheit to Celsius
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (5.0 / 9.0) * (fahrenheit - 32); // Use floating-point division
            System.out.println(fahrenheit + "Fahrenhet is equivalent to " + celsius + "degree Celsius.");

        } else {
            // Invalid input
            System.out.println("Invalid choice! Please restart the program and enter either 1 or 2.");
        }
    }
}
