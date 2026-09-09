package if_else;

import java.util.Scanner;

public class Bhanu {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0) System.out.println("Apurva");
        else if (n%5==0 ) System.out.println("Riya");
        else if(n%3==0) System.out.println("Bhanu");
//        else if(n%5==0 && n%3==0) System.out.println("Apurva");
        else if (n%5!=0 || n%3!=0 ) System.out.println("Isha");
        else System.out.println("Nothing");

    }
}
