import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(isEvenOdd(n));
    }

    public static int isEvenOdd(int n) {
        if (n % 2 == 1) {
            return oddCal(n, 1);
        } else {
            return evenCal(n, 2);
        }
    }

    public static int oddCal(int n, int current) {
        if (current > n) {
            return 0;
        }

        if (current % 2 == 1) {
            return current + oddCal(n, current + 2);
        }

        return oddCal(n, current + 1);
    }

    public static int evenCal(int n, int current) {
        if (current > n) {
            return 0;
        }

        if (current % 2 == 0) {
            return current + evenCal(n, current + 2);
        }

        return evenCal(n, current + 1);
    }
}