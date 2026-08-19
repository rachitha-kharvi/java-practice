package set;

import java.util.*;

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
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (numberSet.contains(arr[i])) {
                return true;
            }
            numberSet.add(arr[i]);
        }
        return false;

    }
}
