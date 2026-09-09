package if_else;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

//        int chaitanya;
//        if(a>0) chaitanya=100;
//        else chaitanya=0;
//        System.out.println(chaitanya);

        //using ternary
        int chaitanya = (a>=0) ? 100 : 0;
        System.out.println(chaitanya);



    }
}
