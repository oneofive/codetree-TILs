import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.print(isLeap(year));
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 != 0)) {
                return false;
            }

            return true;
        }

        return false;
    }
}