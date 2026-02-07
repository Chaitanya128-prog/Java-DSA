package dsa.arrays.medium;

import java.util.Scanner;

public class WaveTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
         for(int i = 0; i<arr.length ; i++){
             arr[i] = sc.nextInt();
         }
        for(int i = 0;i<arr.length;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            if(arr[i]==arr.length-1) break;


        }
        for(int i = 0;i<arr.length;i++) System.out.print(arr[i]+" ");

    }
}
