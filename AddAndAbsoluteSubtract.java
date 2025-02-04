import java.util.Scanner;
class AddAndAbsoluteSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int difference = Math.abs(num1 - num2);
        System.out.println("Sum: " + sum);
        System.out.println("Absolute Difference: " + difference);
        scanner.close();
    }
}
