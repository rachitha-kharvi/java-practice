package set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCheck {
    public static void main(String[] args) {
       int[] nums = {1,2,3,1};
//        int[] nums = {1,2,3,4};
       Set<Integer> set=new HashSet<>();
       for (int num: nums){
           /*if(set.contains(num)){
               System.out.println("found duplicate");
               return;
           }
           set.add(num);*/
           if(!set.add(num)){
               System.out.println("found duplicate");
               return;
           }
       }
        System.out.println("Not found duplicate");
    }
    }
