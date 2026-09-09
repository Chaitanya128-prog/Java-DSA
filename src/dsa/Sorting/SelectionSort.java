package dsa.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = Sc.nextInt();
        }
        for(int i = 0 ; i< n-1 ; i++){
            int min = Integer.MAX_VALUE , mindex = -1;
            for(int j = i ; j < n ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
