import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        displayStar(N, 1);
    }

    public static void displayStar(int N, int current) {
        if (current > N) {
            return;
        }

        for (int i = 0; i < current; i++) {
            System.out.print("*");
        }
        System.out.println();
        displayStar(N, current + 1);
    }
}