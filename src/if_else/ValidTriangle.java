package if_else;

import java.util.Scanner;


public class ValidTriangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second  number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        if(a+b>c && c+a>b && b+c>a) System.out.println("Valid trianlge");
        else System.out.println("not");

    }
}
