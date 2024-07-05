import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(findMax(arr, n));
    }

    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int max = findMax(arr, n - 1);

        return Math.max(arr[n - 1], max);
    }
}