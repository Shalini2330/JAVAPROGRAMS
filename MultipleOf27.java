import java.util.Scanner;
class MultipleOf27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 27 == 0) {
            System.out.println(num + " is a multiple of 27.");
        } else {
            System.out.println(num + " is NOT a multiple of 27.");
        }
        scanner.close();
    }
}
