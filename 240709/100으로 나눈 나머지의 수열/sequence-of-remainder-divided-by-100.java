import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        System.out.println(calculateSequence(N));
    }

    // 재귀 함수 정의
    private static int calculateSequence(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 4;
        } else {
            int prev1 = calculateSequence(n - 1);
            int prev2 = calculateSequence(n - 2);

            return (prev1 * prev2) % 100;
        }
    }
}