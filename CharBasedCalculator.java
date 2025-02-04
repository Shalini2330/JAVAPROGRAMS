import java.util.Scanner;
class CharBasedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operation (a: addition, s: subtraction, m: multiplication, d: division, u: modulus): ");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case 'a':
                System.out.println(num1 + "a" + num2 + " = " + (num1 + num2));
                break;
            case 's':
                System.out.println(num1 + "s" + num2 + " = " + (num1 - num2));
                break;
            case 'm':
                System.out.println(num1 + "m" + num2 + " = " + (num1 * num2));
                break;
            case 'd':
                if (num2 != 0)
                    System.out.println(num1 + "d" + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Error! Division by zero.");
                break;
            case 'u':
                if (num2 != 0)
                    System.out.println(num1 + "u" + num2 + " = " + (num1 % num2));
                else
                    System.out.println("Error! Modulus by zero.");
                break;
            default:
                System.out.println("Invalid operation choice.");
        }
        scanner.close();
    }
}
