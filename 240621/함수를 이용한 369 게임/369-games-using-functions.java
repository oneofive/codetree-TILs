import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isContain369(i) || isMultipleOf3(i)) {
                count++;
            }
        }

        System.out.print(count);
    }

    public static boolean isContain369(int n) {
        while (n >= 1) {
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }

            n /= 10;
        }

        return false;
    }

    public static boolean isMultipleOf3(int n) {
        return n % 3 == 0;
    }
}