package Loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
//        boolean flag = false; // false means prime

//        for(int i = 2; i<=n-1 ; i++){
//            if(n%i==0) {
//                System.out.println("Composite Number");
//                break;
//            }//mtlb i to n ke beech ek composite number nikla

//        for(int i = 2 ; i<=n-1 ; i++){
//            if(n%i==0){
//            flag = true;
//            break ;
//            }
        for(int i =1 ; i<=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                System.out.println(i);
                System.out.println(n/i);
            }


        }


        }
//        if(n==1) System.out.println("Neither p and nor composite");
//        if(flag==true) System.out.println("Composite Number");
//        else System.out.println("Prime Number");
    }

