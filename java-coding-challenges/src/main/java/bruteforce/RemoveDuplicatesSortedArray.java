package bruteforce;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = nums.length;
        int[] result = new int[n];
        if (n == 0) {
            System.out.println("No element");
            return;
        }
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < k; j++) {
                if (result[j] == nums[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result[k] = nums[i];
                k++;
            }
        }
        System.out.println("Number of unique elements: " + k);

        System.out.println("Unique elements: "
                + Arrays.toString(Arrays.copyOf(result, k)));
    }
}
