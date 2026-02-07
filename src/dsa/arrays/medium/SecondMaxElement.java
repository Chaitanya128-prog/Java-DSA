package dsa.arrays.medium;

import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i]>max) max=arr[i];
        }

        for(int i =0; i<arr.length ; i++){
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }

}
