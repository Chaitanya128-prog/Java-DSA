package dsa.arrays.medium;

import java.util.Scanner;
//We use 2 Pointer Technique/variable
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0 ;i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0,j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
