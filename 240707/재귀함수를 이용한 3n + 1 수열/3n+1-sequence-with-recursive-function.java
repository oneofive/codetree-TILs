import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countOperations(n);
        System.out.println(result);
    }

    public static int countOperations(int n) {
        if (n == 1) {
            return 0;
        }
        
        if (n % 2 == 0) {
            return countOperations(n / 2) + 1;
        } else {
            return countOperations(3 * n + 1) + 1;
        }
    }
}