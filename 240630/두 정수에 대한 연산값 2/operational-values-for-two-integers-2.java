import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result[] = cal(a, b);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] cal(int a, int b) {
        if (a < b) {
            a += 10;
            b *= 2;
        } else {
            a *= 2;
            b += 10;
        }

        int result[] = {a, b};

        return result;
    }
}