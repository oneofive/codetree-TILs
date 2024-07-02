import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        displayDescending(n, 1);
        displayAscending(n, 1);
    }

    public static void displayAscending(int n, int current) {
        if (n >= 1) {
            for (int i = 0; i < current; i++) {
                System.out.print("* ");
            }
            System.out.println();
            displayAscending(n - 1, current + 1);
        }
    }

    public static void displayDescending(int n, int current) {
        if (n >= 1) {
            displayDescending(n - 1, current + 1);
            for (int i = 0; i < current; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}