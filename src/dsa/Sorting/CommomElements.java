package dsa.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommomElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.print("Enter the size of second array: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i = 0 ; i < m ; i++){
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> result = commonElements(a, b);

        System.out.println("Common elements: " + result);
    }
    public static ArrayList<Integer> commonElements(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return ans;
    }
}
