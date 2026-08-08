package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = new int[nums.length];
//        int[] nums = {1,2,3,4};
        int leftProduct = 1, rightProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i]=leftProduct;
            leftProduct *= nums[i];
        }

        for (int j = nums.length-1; j >=0; j--) {
            result[j] *=rightProduct;
            rightProduct *= nums[j];
        }

        Arrays.stream(result).forEach(System.out::println);
    }
}
