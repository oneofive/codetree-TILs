import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        System.out.print(isValidDate(M, D));
    }

    public static String isValidDate(int M, int D) {
        if (M == 1 && D >= 1 && D <= 28) {
            return "Yes";
        }

        if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
            if (D >= 1 && D <= 31) {
                return "Yes";
            }
        } else {
            if(D >= 1 && D <= 30) {
                return "Yes";
            }
        }

        return "No";
    }
}