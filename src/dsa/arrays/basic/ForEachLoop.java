package dsa.arrays.basic;

import java.util.Scanner;

public class ForEachLoop {
    //especially used to traverse in DSA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
