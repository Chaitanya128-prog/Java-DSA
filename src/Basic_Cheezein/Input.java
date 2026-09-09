package Basic_Cheezein;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
//        double r = sc.nextDouble();
//
//        double a = 3.14159*r*r;
//        System.out.println(a);
//    }
        int number = sc.nextInt();
        System.out.print("Your Sqaure is : ");
        int square = number*number;
        System.out.println(square);

    }
}
