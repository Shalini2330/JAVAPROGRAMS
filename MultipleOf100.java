import java.util.Scanner;
class MultipleOf100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 100 == 0) {
            System.out.println(num + " is a multiple of 100.");
        } else {
            System.out.println(num + " is NOT a multiple of 100.");
        }
        scanner.close();
    }
}
