import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        if (isValid(Y, M, D)) {
            System.out.print(findSeason(M));
        }
    }

    public static boolean isLeap(int Y) {
        if (Y % 4 == 0) {
            if (Y % 100 == 0) {
                if (Y % 400 == 0) {
                    return true;
                }

                return false;
            }

            return true;
        }

        return false;
    }

    public static boolean isValid(int Y, int M, int D) {
        // if (Y < 1 || Y > 3000 || M < 1 || M > 12 || D < 1 || D > 31) {
        //     return false;
        // }

        int[] daysOfMonth = {31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeap(Y)) {
            if (M == 2) {
                if (D >= 1 && D <= 29) {
                    return true;
                }
            }
        } else {
            if (D >= 1 && D <= daysOfMonth[M]) {
                return true;
            }
        }

        return false;
    }

    public static String findSeason(int M) {
        if (M == 3 || M == 4 || M == 5) {
            return "Spring";
        }

        if (M == 6 || M == 7 || M == 8) {
            return "Summer";
        }

        if (M == 9 || M == 10 || M == 11) {
            return "Fall";
        }

        if (M == 12 || M == 1 || M == 2) {
            return "Winter";
        }

        return "-1";
    }
}