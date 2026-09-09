package dsa.BinarySearch;

import java.util.Scanner;

public class LastOccurence {
//    private static Object system;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int low = 0 , high = n-1 , idx =-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > target) high = mid-1;
            else if(arr[mid]<target) low = mid+1;
            else{
                idx=mid;
                low = mid+1;
            }
        }
        System.out.println(idx);

    }
}
