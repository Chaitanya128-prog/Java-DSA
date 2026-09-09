package Loops;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1;i<n;i++){
        if(i%2!=0) System.out.println((i+1)/2);
        else System.out.println(n-(i/2)+1);

    }


    }
}
