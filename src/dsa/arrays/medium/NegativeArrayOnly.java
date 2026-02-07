package dsa.arrays.medium;

import java.util.Scanner;

public class NegativeArrayOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Elemnets: ");
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}
