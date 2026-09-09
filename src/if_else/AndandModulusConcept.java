package if_else;

import java.util.Scanner;

public class AndandModulusConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second  number: ");
        int b = sc.nextInt();

//        if (a>999 && a<9999) System.out.println("Four digit number");
//        else System.out.println("Not a four digit number");
        //OR OTHER LOGIC TO CHECK THIS

//        if(a%1000!=a ) System.out.println("4 digit number");
//        else System.out.println("Not 4 digit");

//        a = -(a);
//        if(a<0){
//            a = -a;
//        }
//        if (a<69) {
//
//            System.out.println(true);
//        }
//        else System.out.println(false);
        int c = a/b;
        System.out.println(c);
    }
}
