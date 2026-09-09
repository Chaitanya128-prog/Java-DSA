package if_else;

import java.util.Scanner;

public class OrOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0) System.out.println("Number is divisible by 5 or 3");
        else System.out.println("Number is not divisible by 5 or 34");

    }
}
