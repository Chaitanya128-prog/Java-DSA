//package dsa.BridgeLab;
//
//import java.util.Scanner;
//
//public class SquareThanSort {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i = 0 ; i< n ; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0 ; i<n ; i++){
//            arr[i] = (int) Math.pow(arr[i], 2);
//        }
////        for(int ele : arr){
////            System.out.print(ele+" ");
////        }
//        for(int i = 0 ; i<=  n-1 ; i++) {
//            boolean isSorted= true;
//            for(int j = 0 ; j<n-1 ; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    isSorted=false;
//                    break;
//                }
//            }
//            if(isSorted==true) break;
//            for (int j = 0; j < n-1-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//    }
//}
package dsa.BridgeLab;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareThanSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> result = new ArrayList<>();

        int left = 0;
        int right = n - 1;


        for (int i = 0; i < n; i++) {
            result.add(0);
        }

        int index = n - 1;

        while (left <= right) {

            int leftSquare = arr.get(left) * arr.get(left);
            int rightSquare = arr.get(right) * arr.get(right);

            if (leftSquare > rightSquare) {
                result.set(index, leftSquare);
                left++;
            } else {
                result.set(index, rightSquare);
                right--;
            }

            index--;
        }

        System.out.println(result);
    }
}