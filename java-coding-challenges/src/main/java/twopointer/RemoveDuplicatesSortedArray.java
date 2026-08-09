package twopointer;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n= nums.length;

        if(n ==0){
            System.out.println("No element");
            return;
        }
        int write = 1;
        for (int read = 1; read < n; read++) {
            if(nums[read]!= nums[read-1]){
                nums[write]=nums[read];
                write++;
            }
        }
        System.out.println("Number of unique elements: " + write);

        System.out.println("Unique elements: "
                + Arrays.toString(Arrays.copyOf(nums, write)));
    }
}
