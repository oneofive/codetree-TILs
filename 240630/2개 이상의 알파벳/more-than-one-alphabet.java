import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (cal(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean cal(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {

                    return true;
                }
            }
        }

        return false;
    }
}