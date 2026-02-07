package dsa.arrays.medium;

import java.util.Scanner;

public class SegregateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i<arr.length ; i++){

                int x= sc.nextInt();

                if(x==0 || x==1){
                    arr[i]=x;
                }
            else {
                System.out.println("Enter only 0 or 1");
                i--;
                }

        }

        int i = 0,j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1) j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
