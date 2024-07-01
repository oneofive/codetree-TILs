import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(cal(arr, m));
    }

    public static int cal(int[] arr, int m) {
        int result = 0;

        while (m >= 1) {
            result += arr[m - 1];
            if (m % 2 == 0) {
                m /= 2;
            } else {
                m -= 1;
            }
        }

        return result;
    }
}