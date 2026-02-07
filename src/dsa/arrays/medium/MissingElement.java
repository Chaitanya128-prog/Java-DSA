package dsa.arrays.medium;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        n = arr.length+1;
        int NormalSum = n*(n+1)/2;
        int ArraySum=0;
        for(int i = 0 ; i<arr.length ; i++){
            ArraySum+=arr[i];
        }
        int diff = NormalSum-ArraySum;
        System.out.println(diff);
    }
}
