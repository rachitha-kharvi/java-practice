package arrays.two_pointer;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveELement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input is handled for the student
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered elements\n"+Arrays.toString(arr));
        System.out.print("Enter a value to remove\n");
        int value = sc.nextInt();
        System.out.print("After removing given elements\n");
        System.out.println(removeElement(arr, value));
    }
    public static int removeElement(int[] arr, int value) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
