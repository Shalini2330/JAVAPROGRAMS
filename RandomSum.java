import java.util.Random;
class RandomSum {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100); 
        int num2 = random.nextInt(100);
        int sum = num1 + num2;
        System.out.println("Random Number 1: " + num1);
        System.out.println("Random Number 2: " + num2);
        System.out.println("Sum: " + sum);
    }
}
