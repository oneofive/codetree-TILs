import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] result = swap(n, m);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }
}