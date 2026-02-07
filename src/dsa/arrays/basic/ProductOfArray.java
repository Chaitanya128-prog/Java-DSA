package dsa.arrays.basic;

import java.util.Scanner;

public class ProductOfArray {
    public static void product(int[] arr) {
        int prod = 1;
        for(int i = 0;i<arr.length ; i++){
            prod*=arr[i];
//            System.out.println(prod);
        }
        System.out.println(prod);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        product(arr);
//        int prod = 1;
//        for(int i = 0;i<arr.length ; i++){
//            prod*=arr[i];
//        System.out.println(prod);
//        }
//        System.out.println(prod);
    }
}
