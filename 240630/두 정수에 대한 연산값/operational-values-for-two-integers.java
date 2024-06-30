import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result = cal(a, b);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] cal(int a, int b) {
        int big = a;
        int small = b;

        if (a < b) {
            small = a;
            big = b;
        } else {
            small = b;
            big = a;
        }

        int[] result = new int[2];
        result[0] = small * 2;
        result[1] = big + 25;

        return result;
    }
}