package dsa.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println(" ");
//        for(int j = 0 ; j<=  n-1 ; j++) {
//            for (int i = 0; i < n - 1-j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        boolean flag = true;
        for(int j = 0 ; j<=  n-1 ; j++) {
            boolean isSorted= true;
            for(int i = 0 ; i<n-1 ; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted=false;
                    break;
                }
            }
            if(isSorted==true) break;
            for (int i = 0; i < n - 1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
