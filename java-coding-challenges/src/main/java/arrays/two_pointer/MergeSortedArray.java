package arrays.two_pointer;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter m\n");
        int m = sc.nextInt();
        System.out.println("Enter n\n");
        int n = sc.nextInt();
        int[] arr1 = new int[m+n];
        System.out.println("Enter array1 elements\n");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Entered elements in Array1\n" + Arrays.toString(arr1));
        int[] arr2 = new int[n];
        System.out.println("Enter array2 elements\n");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Entered elements in Array2\n" + Arrays.toString(arr2));

        System.out.print("After merging both arrays\n");
        merge(arr1, arr2,m,n);
    }

    public static void merge(int[] arr1, int[] arr2,int m, int n) {
        int last = m+n-1;
        while (m > 0 && n > 0){
            if(arr1[m-1] > arr2[n-1]){
                arr1[last]= arr1[m-1];
                m--;
            }else {
                arr1[last] = arr2[n-1];
                n--;
            }
            last--;
        }
        while (n > 0){
            arr1[last]=arr2[n-1];
            n--;
            last--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
