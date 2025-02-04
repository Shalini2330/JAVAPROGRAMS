import java.util.Scanner;
class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first float: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter second float: ");
        float num2 = scanner.nextFloat();
        num1 = Math.round(num1 * 1000) / 1000.0f;
        num2 = Math.round(num2 * 1000) / 1000.0f;
        if (num1 == num2) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are not equal up to three decimal places.");
        }
        scanner.close();
    }
}
