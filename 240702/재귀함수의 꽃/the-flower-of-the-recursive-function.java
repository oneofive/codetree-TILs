import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        display(N);
    }

    public static void display(int N) {
        if (N >= 1) {
            System.out.print(N + " ");
            display(N - 1);
            System.out.print(N + " ");
        }

    }
}