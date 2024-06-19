import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("1");
            }
            System.out.print("\n");
        }
        
    }
}