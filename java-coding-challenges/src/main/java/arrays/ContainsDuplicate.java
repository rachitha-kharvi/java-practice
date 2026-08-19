package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input is handled for the student
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = containsDuplicate(arr);
            System.out.print("Contains duplicate elements\n"+ ans);

    }
    public static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i])
                return true;
        }
        return false;
    }
}
