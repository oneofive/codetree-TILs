import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = cal(n);

        System.out.print(result);
    }

    // 1 ~ n까지 합 후에 나누기 10
    public static int cal(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum / 10;
    }
}