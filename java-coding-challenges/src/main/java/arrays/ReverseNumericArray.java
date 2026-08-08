package arrays;

import java.util.Scanner;

public class ReverseNumericArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input is handled for the student
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = reverse(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) System.out.print(" ");
        }
    }

    public static int[] reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
