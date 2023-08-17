package arrays.assignment;

import java.util.*;
import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        System.out.println("Enter 10 array elements");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void reverse(int [] arr){
        int start= 0;
        int end= arr.length -1;
        while (start<end){
            swap(arr,)
        }
    }
}