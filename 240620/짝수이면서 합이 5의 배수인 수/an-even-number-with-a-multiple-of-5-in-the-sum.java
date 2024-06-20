import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isTrue(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isTrue(int n) {
        if (n % 2 == 0) {
            if (((n % 10) + (n / 10)) % 5 == 0) {
                return true;
            }
        }

        return false;
    }
}