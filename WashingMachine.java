import java.util.Scanner;
class WashingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of clothes (in grams): ");
        int weight = scanner.nextInt();
        System.out.print("Enter water level (L/M/H): ");
        char waterLevel = scanner.next().charAt(0);
        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 Minutes");
        } else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } else {
            int time = 0;
            switch (waterLevel) {
                case 'L':
                    if (weight <= 2000) time = 25;
                    break;
                case 'M':
                    if (weight > 2000 && weight <= 4000) time = 35;
                    break;
                case 'H':
                    if (weight > 4000 && weight <= 7000) time = 45;
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    return;
            }
            if (time > 0) {
                System.out.println("Time Estimated: " + time + " Minutes");
            } else {
                System.out.println("INVALID INPUT");
            }
        }
        scanner.close();
    }
}
