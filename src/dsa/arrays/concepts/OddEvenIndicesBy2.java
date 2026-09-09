package dsa.arrays.concepts;

import java.util.Scanner;

public class OddEvenIndicesBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Andar(arr);

    }
    public static void Andar(int[] arr){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length ; i++){
            if(i%2==0) arr[i]+=10;
            else arr[i]*=2;
            System.out.print(arr[i]+" ");

        }

    }
}
