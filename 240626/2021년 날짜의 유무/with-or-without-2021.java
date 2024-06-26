import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        System.out.print(isValidDate(M, D));
    }

    public static String isValidDate(int M, int D) {
        if (M < 1 || M > 12) {
            return "No";
        }

        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (D >= 1 && D <= daysOfMonth[M - 1]) {
            return "Yes";
        }

        return "No";
    }
}