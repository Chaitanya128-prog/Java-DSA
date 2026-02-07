package dsa.arrays.basic;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         int[] arr = {23,45,67,89,90,23,-90,34};
//        System.out.println(arr.length);
//         for(int i = 0 ; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");


//         }
        int[] chintu = new int[7];
        for(int i = 0 ; i<chintu.length ; i++){
            chintu[i]=sc.nextInt();

        }
        for(int i = 0 ; i<chintu.length ; i++){
            System.out.print(chintu[i]+" ");
        }
    }

}
