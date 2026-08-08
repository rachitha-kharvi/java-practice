package strings;

import java.util.Scanner;

public class ReeverseStringTwoPointer {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        char[] arr = name.toCharArray();
        System.out.println("Reverse of string\n");
        reverse(arr);

        for (char ch: arr) {
            System.out.print(ch);

        }
    }
    /*public static char[] reverse(char[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }*/
//    Using two pointes
    public static char[] reverse(char[] arr) {

        for (int left = 0,right=arr.length-1; left < right; ) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return arr;
    }
}
