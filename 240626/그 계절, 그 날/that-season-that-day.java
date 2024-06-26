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
        return (Y % 4 == 100) || (Y % 4 == 100 && Y % 400 == 0);
    }

    public static boolean isValid(int Y, int M, int D) {
        if (Y < 1 || Y > 3000 || M < 1 || M > 12) {
            return false;
        }

        int[] daysOfMonth = {31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeap(Y)) {
            daysOfMonth[1] = 29;
        }

        return D >= 1 && D <= daysOfMonth[M];
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