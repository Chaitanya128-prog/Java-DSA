package dsa.BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int root = 0;
//        for(int i = 0 ; i < n ; i++){
////            root = i;
//            if(i*i>n) break;
//            root = i;
//        }
//        System.out.println(root);
        int low = 0 , high = n ;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(mid*mid==n) System.out.println(mid);
            else if(mid*mid>n) high=mid-1;
            else low=mid+1;
        }
        System.out.println(high);
    }
}
