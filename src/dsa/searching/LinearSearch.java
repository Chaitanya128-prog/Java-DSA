package dsa.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<arr.length ; i++)  arr[i]=sc.nextInt();
        boolean flag = false; //mtlb target array mein nahi hai....
        System.out.print("Enter the Element you want to search: ");
        int target = sc.nextInt();
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == target){
                flag=true;
                break;
            }

        }
        if(flag==true) System.out.println("Element Found successfully....");

        else System.out.println("not found brother");

    }
}
