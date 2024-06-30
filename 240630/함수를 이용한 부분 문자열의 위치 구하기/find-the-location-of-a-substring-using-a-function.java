import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String object = scanner.nextLine();

        System.out.print(cal(input, object));
    }

    public static int cal(String input, String object) {
        int start = 0;
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == object.charAt(start)) {
                start++;
                index = i;

                if (start == object.length()) {
                    break;
                }
            } else {
                start = 0;
            }
        }

        if (start == 0) {
            return -1;
        }

        return index - object.length() + 1;
    }
}