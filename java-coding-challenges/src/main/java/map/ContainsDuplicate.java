package map;

import java.util.HashMap;
import java.util.Map;
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
        System.out.print("Contains duplicate elements\n" + ans);

    }

    public static boolean containsDuplicate(int[] arr) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (numberMap.containsKey(arr[i])) {
                return true;
            }
            numberMap.put(arr[i], 1);
        }
        return false;

    }
}
