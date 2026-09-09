package Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
//        int count =0;

        while(n!=0){
            int LastDigit= n%10;
//            count++;
            sum=LastDigit;
            System.out.print(sum);
//            System.out.println(n);
//            System.out.println(count);
            n/=10;

        }
//        System.out.println(sum);
//        System.out.println(n);
//        System.out.println(count);
    }
}
