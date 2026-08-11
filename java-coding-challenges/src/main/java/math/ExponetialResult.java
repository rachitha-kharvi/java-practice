package math;

import java.util.Scanner;

public class ExponetialResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base");
        int base = scanner.nextInt();
        System.out.println("Enter exponent value");
        int exponent = scanner.nextInt();
        int lastDigit = computeLogic(base, exponent);
        System.out.println("last digit"+lastDigit);
    }

    private static int computeLogic(int base, int exponent) {
        int result = 1;
        base = base % 10;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (base * result) % 10;
            }
            base = (base * base) % 10;
            exponent = exponent / 2;
        }
        return result;
    }
}
