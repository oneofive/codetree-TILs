import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int a = Integer.parseInt(parts[0]);
        String o = parts[1];
        int c = Integer.parseInt(parts[2]);

        if (o.equals("+")) {
            System.out.print(a + " + " + c + " = " + plus(a, c));
        } else if(o.equals("-")) {
            System.out.print(a + " - " + c + " = " + minus(a, c));
        } else if (o.equals("/")) {
            System.out.print(a + " / " + c + " = " + divide(a, c));
        } else if (o.equals("*")) {
            System.out.print(a + " * " + c + " = " + multiple(a, c));
        } else {
            System.out.print("False");
        }
    }

    public static int plus(int a, int c) {
        return a + c;
    }

    public static int minus(int a, int c) {
        return a - c;
    }

    public static int divide(int a, int c) {
        return a / c;
    }

    public static int multiple(int a, int c) {
        return a * c;
    }
}