import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print(findMin(a, b, c));
    }

    public static int findMin(int a, int b, int c) { // 38 4 -40
        int min = a;

        if (b < min) {
            min = b;
        } if (c < min) {
            min = c;
        } else {
            return min;
        }
        
        return min;
    }
}