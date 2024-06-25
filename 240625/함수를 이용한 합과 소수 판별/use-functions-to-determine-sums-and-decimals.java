import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isSumOfDigitEven(i)) {
                count++;
            }
        }

        System.out.print(count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSumOfDigitEven(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}