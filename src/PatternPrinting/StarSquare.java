package PatternPrinting;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
//        System.out.print("Enter the coloumn: ");
//        int column = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print("love u ");
            }
            System.out.println();
        }

    }
}
