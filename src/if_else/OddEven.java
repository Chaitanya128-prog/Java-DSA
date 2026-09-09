package if_else;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first positive number: ");
        int a = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int b = sc.nextInt();
        System.out.println("Your First number is: "+a);
//        System.out.println("Your second number is: "+b);
//        if(a%2==0){
//            System.out.println("It is even.");
//        }
//        else{
//            System.out.println("odd");
//        }

//        int b = 67;
//        System.out.println(b%2);

        //Other way to write it
        if(a%2==0) System.out.println("It is even.");
        else  System.out.println("odd");




    }
}
