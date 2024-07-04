import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return n;
        }

        return n * factorial(n - 1);
    }
}