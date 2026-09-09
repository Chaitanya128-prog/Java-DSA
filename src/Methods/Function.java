package Methods;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(4));
        //Math wale function
//        System.out.println(Math.cbrt(100));
        System.out.println(Math.pow(3,2));
//        System.out.println(Math.PI);
//        System.out.println(Math.abs(-678));
//        System.out.println(Math.floor(-2.8));
//        System.out.println(Math.ceil(3.0001));
//        System.out.println(Math.min(3,9));
//        System.out.println(Math.max(3.456,6.789));
        //Max of three using built in
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter third number: ");
        int d= sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
}
