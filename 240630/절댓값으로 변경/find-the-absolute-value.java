import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] num = new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        cal(num);

        for (int value : num) {
            System.out.print(value + " ");
        }

    }

    public static void cal(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                num[i] *= -1;
            }
        }
    }
}