package dsa.arrays.basic;

import java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0 ;
        for(int i = 0; i<arr.length ; i++){
            max = arr[i];
            if(max>arr[i]) System.out.println();
        }
        System.out.println(max);


    }
}
