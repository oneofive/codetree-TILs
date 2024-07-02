import java.util.Scanner;

public class Main {
    static int m = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        m = scanner.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        int[] arr = new int[2];
        while (m > 0) {
            for (int i = 0; i < 2; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(cal(A, arr));

            m--;
        }
    }

    public static int cal(int[] A, int[] arr) {
        int result = 0;

        for (int i = arr[0]; i <= arr[1]; i++) {
            result += A[i - 1];
        }

        return result;
    }
}