package PatternPrinting;

import java.util.Scanner;

public class Simon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
//        System.out.print("Enter the coloumn: ");
//        int column = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
                if(i == j || i+j ==n+1) System.out.print("* ");       //Standardize way (n/2) + 1 Works for id n is odd
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
