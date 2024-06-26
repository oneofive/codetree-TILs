import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfA = scanner.nextInt();
        int numOfB = scanner.nextInt();

        int[] a = new int[numOfA];
        for (int i = 0; i < numOfA; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[numOfB];
        for (int i = 0; i < numOfB; i++) {
            b[i] = scanner.nextInt();
        }

        if (isContatin(a, b, numOfA, numOfB)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }

    public static boolean isContatin(int[] a, int[] b, int numOfA, int numOfB) {
        int n = 0;
        int m = 0;

        while (n < numOfA && m < numOfB) {
            if (a[n] == b[m]) {
                m++;
            }
            n++;
        }

        return m == numOfB;
    }
}