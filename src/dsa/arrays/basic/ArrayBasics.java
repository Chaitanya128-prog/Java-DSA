package dsa.arrays.basic;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
//        int[] x = {6,14,56,7,8,54};
        //indexing {0,1 ,2 ,3,4 ,5}
//        System.out.println(x[0]);
//        //updating elements   mutablity
//        x[3] = 89;
//        System.out.println(x[3]);
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int[] arr = new int[n];  //4 dabbon ka aaray bna de
        arr[0]=23;
        arr[1]=67;
        arr[2]=987;
        arr[3]=87;
//        System.out.println(arr[3]);
        for(int i = 0; i<=n ;i++ ){
            System.out.println(arr[i]);
        }

    }
}
