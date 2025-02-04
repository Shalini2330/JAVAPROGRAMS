import java.util.Scanner;
import java.util.stream.Stream;
class StreamCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operation (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        Stream.of(operator).forEach(op -> {
            switch (op) {
                case '+': System.out.println("Result: " + (num1 + num2));
                case '-': System.out.println("Result: " + (num1 - num2));
                case '*': System.out.println("Result: " + (num1 * num2));
                case '/': 
                    if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                    else System.out.println("Cannot divide by zero!");
                case '%': 
                    if (num2 != 0) System.out.println("Result: " + (num1 % num2));
                    else System.out.println("Cannot find modulus with zero!");
            }
        });
        scanner.close();
    }
}
