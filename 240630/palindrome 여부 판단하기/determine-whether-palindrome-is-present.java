import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isPalindrome(String str) {
        int first = 0;
        int last = str.length() - 1;

        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {

                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}