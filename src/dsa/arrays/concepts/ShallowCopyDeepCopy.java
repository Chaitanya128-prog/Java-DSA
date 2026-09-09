package dsa.arrays.concepts;

import java.util.Arrays;



public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {23,45,67,89,45,23};
//        int[] x = arr;   //x is the shallow copy pf arr
//        x[0]= 167;
//        System.out.println(arr[0]);
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 67;
        System.out.println(deep[0    ]);                                                                                         System.out.println(arr[0]);


    }
}
