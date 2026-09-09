package Loops;

import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            System.out.println(i);

            System.out.println("Fuck you");
            if(i==13) continue;
            System.out.println("HELLO");

        }
    }
}
