import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int result = num1 * num2 * num3;
        
        System.out.println(calculateDigitSum(result));
    }
    
    public static int calculateDigitSum(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + calculateDigitSum(number / 10);
        }
    }
}