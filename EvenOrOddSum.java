import java.util.Scanner;
class EvenOrOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        if (sum % 2 == 0) {
            System.out.println("The sum (" + sum + ") is even.");
        } else {
            System.out.println("The sum (" + sum + ") is odd.");
        }
        scanner.close();
    }
}
