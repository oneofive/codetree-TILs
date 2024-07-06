import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int product = num1 * num2 * num3;

        System.out.println(sumOfDigits(product));
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }
}