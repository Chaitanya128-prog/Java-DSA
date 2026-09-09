package if_else;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        //condition ? sach : jhoot
        System.out.println((n%2==0) ? "Even" : "Odd");



    }
}
