package dsa.arrays.concepts;

import java.util.Scanner;

public class TwoSumLeeti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sum(arr);

    }
    public static void sum(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target Number: ");
        int target = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("target Found..");
                    break;

                }

            }

        }
    }
}
