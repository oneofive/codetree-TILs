import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num >= 9) {
                    num = 0;
                }
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}