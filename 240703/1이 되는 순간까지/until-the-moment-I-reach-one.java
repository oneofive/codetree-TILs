import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(cal(n));
    }

    public static int cal(int n) {
        int count = 0; 
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return 1 + cal(n / 2);
        } else {
            return 1 + cal(n / 3);
        }
    }
}