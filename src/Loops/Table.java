package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
//        for(int i =1; i<=n ; i++){
//            System.out.println(17*i);
//        }
        //Better nahi hai kyunki loop 154 baar chlega
        //for(int i = 17; i<=170; i++){
//       //if(i%17==0) sout(i)
        //OR
        //Better hai kyunku loop bss 10 baar chlega
        for(int i = 17; i<=170 ;i=i+17){
            System.out.println(i);
        }
    }
}
