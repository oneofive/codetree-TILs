import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPerfect(i)) {
                count++;
            }
        }

        System.out.print(count);
    }

    public static boolean isPerfect(int n) {
        if (n % 2 == 0 || (n % 3 == 0 && n % 9 != 0)) {
            return false;
        }

        if (split(n) == 1) {
            if (n == 5) {
                return false;
            }
        }

        if (split(n) == 2) {
            if (n % 10 == 5) {
                return false;
            }
        }

        if (split(n) == 3) {
            if (n % 100 == 5) {
                return false;
            }
        }

        return true;
    }

    public static int split(int n) {
        int time = 0;

        while (n > 0) {
            n /= 10;
            time++;
        }

        return time;
    }
}