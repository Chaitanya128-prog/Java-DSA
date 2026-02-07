package dsa.arrays.medium;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int i = 0,j=k-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        while(i<j){

        }

    }
}
