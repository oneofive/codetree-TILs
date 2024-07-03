import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(cal(n));
    }

    public static int cal(int n) {
        if (n <= 1) {
            return n;
        }

        return n + cal(n - 1);
    }
}