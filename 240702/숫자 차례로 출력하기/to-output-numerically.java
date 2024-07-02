import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        displayAscending(N);
        System.out.println();
        displayDescending(N);

    }

    public static void displayAscending(int N) {
        if (N > 0) {
            displayAscending(N - 1);
            System.out.print(N + " ");
        }
    }

    public static void displayDescending(int N) {
        if (N > 0) {
            System.out.print(N + " ");
            displayDescending(N - 1);
        }
    }
}