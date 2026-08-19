package arrays.two_pointer;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input is handled
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Entered elements in sorted order\n"+ Arrays.toString(arr));
        System.out.print("After removing duplicate elements\n");
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr) {
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
