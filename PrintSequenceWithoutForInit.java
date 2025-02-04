import java.util.Scanner;
class PrintSequenceWithoutForInit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        int i = 1;
        System.out.print("The first " + n + " natural numbers are: ");
        for (; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
