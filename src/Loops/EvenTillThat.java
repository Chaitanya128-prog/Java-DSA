package Loops;

import java.util.Scanner;

public class EvenTillThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till you want the numbers: ");
        int n = sc.nextInt();
        for(int i = 0; i<=n ; i++){
            if(i%2==0){
                System.out.println(i);
            }
//            System.out.println((i%2==0) ? "Even numenber: "+i : );
        }
    }
}
