import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int M = scanner.nextInt();
        int D = scanner.nextInt();

        if (isValid(Y, M, D)) {
            System.out.print(findSeason(M));
        } else {
            System.out.print("-1");
        }
    }

    public static boolean isLeap(int Y) {
        if (Y % 4 == 0) {
            if (Y % 100 == 0) {
                if (Y % 400 == 0) {
                    return true;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int Y, int M, int D) {
        if (Y < 1 || Y > 3000 || M < 1 || M > 12 || D < 1 || D > 31) {
            return false;
        }

        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeap(Y)) {
            daysOfMonth[1] = 29;
        }

        return D >= 1 && D <= daysOfMonth[M - 1];
    }

    public static String findSeason(int M) {
        switch (M) {
            case 3: case 4: case 5:
                return "Spring";
            case 6: case 7: case 8:
                return "Summer";
            case 9: case 10: case 11:
                return "Fall";
            case 12: case 1: case 2:
                return "Winter";
            default:
                return "-1";
        }
    }
}