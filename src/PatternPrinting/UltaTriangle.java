package PatternPrinting;

import java.util.Scanner;

public class UltaTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
//            System.out.println("*");
            for(int j =1 ; j<=n+1-i ; j++){     //Standard Template
                System.out.print("* ");
            }
            System.out.println();

        }
//

    }
}
//for(int j = n ; j>=i ; j--)