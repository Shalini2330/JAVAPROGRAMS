import java.util.Scanner;
class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;
            System.out.println("Natural numbers up to " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("\nSum of natural numbers up to " + n + " is: " + sum);
        }
        scanner.close();
    }
}
