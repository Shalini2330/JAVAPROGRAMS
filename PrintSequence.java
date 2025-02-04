import java.util.Scanner;
class PrintSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        System.out.print("The first " + n + " natural numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
        scanner.close();
    }
}
