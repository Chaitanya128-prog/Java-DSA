package if_else;

import java.util.Scanner;

public class GreatestOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
//        if(a>b && a>c) System.out.println("A is the greatest");
//        else if(b>a && b>c) System.out.println("B is the greatest");
//        else if(c>a && c>b) System.out.println("C is the greatest");
        //BY NESTED LOOP
//        if(a>b){
//            if(a>c) System.out.println("a is greater");
//            else System.out.println("c is greater");    //c is greater than a
//        }
//        else{   //b is greater than a
//            if(b>c) System.out.println("b is the greatest");
//            else System.out.println("c is the greatest");
//        }

        //USING TERNARY OPERATOR

        System.out.println((a>b) ? ((a>c) ? "a is greater" : "c is greater"): ((b>c) ? "b is greater" : "c is greater"));


    }
}
