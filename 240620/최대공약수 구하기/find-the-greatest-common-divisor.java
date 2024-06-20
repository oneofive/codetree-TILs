import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = calGCD(n, m);

        System.out.print(result);
    }

    static int calGCD(int n, int m) {
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return n;
    }
}