package bruteforce;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result=new int[nums.length];
//        int[] nums = {1,2,3,4};
        for (int i = 0; i < nums.length; i++) {
            int product=1;
            for (int j = 0; j < nums.length; j++) {

                if(i != j){
                    product *= nums[j];
                }
            }
            result[i]=product;
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
