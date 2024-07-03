import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(cal(n));
    }

    public static int cal(int n) {
        if (n == 0) {
            return 0;
        }
        
        return (n % 10) * (n % 10) + cal(n / 10);
    }
}