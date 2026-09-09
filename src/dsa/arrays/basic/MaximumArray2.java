package dsa.arrays.basic;

import java.util.Scanner;

public class MaximumArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>max) max= arr[i];

        }
        System.out.println(max);
    }
}
