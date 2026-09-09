package Loops;

import java.util.Scanner;

public class DecrAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a=99, d=4;
//        for(int i = n ; i>=1 ; i--){
//            System.out.println(a+ " " + i);
//            a-=d;
        for(int i = 99 ; i>=103-4*n ; i-=4){
            System.out.println(i);
        }
    }
}
