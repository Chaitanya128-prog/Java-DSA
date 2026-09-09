package dsa.searching;

import java.util.Scanner;

public class SearchArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Search(arr);
    }
    public static void Search(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        boolean found=false; //
        System.out.print("Enter the Number to find in the array: ");
        int target = sc.nextInt();
        for(int i = 0 ; i<arr.length ; i++){
            if(target==arr[i]) {
                found = true;
                break;
            }

        }
        if(found) System.out.print("Element Founded....");
        else System.out.println("Not founded");
    }
}
