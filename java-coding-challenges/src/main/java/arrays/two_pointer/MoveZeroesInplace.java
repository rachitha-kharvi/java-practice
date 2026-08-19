package arrays.two_pointer;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesInplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input is handled for the student
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Move zeroes to end\n");
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }

        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        return arr;
    }
}
