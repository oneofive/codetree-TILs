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
        if (n % 2 == 0 || n % 10 == 5 || (n % 3 == 0 && n % 9 != 0)) {
            return false;
        }

        return true;
    }
}