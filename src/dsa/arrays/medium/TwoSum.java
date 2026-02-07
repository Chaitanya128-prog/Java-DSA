package dsa.arrays.medium;

import java.util.Scanner;

public class TwoSum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of th array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Index: " + i + " " + j);
                    return;  //agar pairs nahi chahiye to
                }
            }


        }
    }
}
