package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i<=3*n-1; i+=3){
            System.out.println(i);
        }

    }
}
//FOR THIS QUESTION
//An= a + (N-1)d  here d=3 and a =2


//int a=2 , d=3;
//for(int i = 1 ; i<=n ; i++){
//    sout(a);
//    a+=d;
//
//        }

