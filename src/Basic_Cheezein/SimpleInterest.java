package Basic_Cheezein;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter the time: ");
        int time = sc.nextInt();
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();
       int SimpleInterest = (principle * time * rate)/100;
        System.out.print("Your si is: ");
        System.out.println(SimpleInterest);
    }
}
