import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String object = scanner.next();

        System.out.print(cal(input, object));
    }

    public static int cal(String input, String object) {
        for (int i = 0; i <= input.length(); i++) {
            int j = 0;
            while (j < object.length() && input.charAt(i + j) == object.charAt(j)) {
                j++;
            }

            if (j == object.length()) {
                return i;
            }
        }

        return -1;
    }
}