import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char a = scanner.nextLine().charAt(0);

        System.out.print("Enter the second character: ");
        char b = scanner.nextLine().charAt(0);

        // Convert characters to integer values
        int intA = a;
        int intB = b;

        // Perform arithmetic operations
        int sum = intA + intB;
        int diff = intA - intB;
        int mul = intA * intB;
        int div = intA / intB;
        int mod = intA % intB;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + mul);
        System.out.println("Quotient: " + div);
        System.out.println("Modulus: " + mod);

        scanner.close();
    }
}
