package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
//        int LastDigit=0;
        int rev=0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
