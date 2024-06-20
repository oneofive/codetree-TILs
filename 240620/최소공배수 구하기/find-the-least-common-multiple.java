import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = LCM(n, m, GCD(n, m));

        System.out.print(result);
    }

    public static int GCD(int n, int m) {
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return n;
    }

    public static int LCM(int n, int m, int GCD) {
        return n * m / GCD;
    }
}