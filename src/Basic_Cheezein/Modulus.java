package Basic_Cheezein;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        //%-Modulus operater gives the operator
        //1. a%b = a   (if a<b)
        //2. a%(-b) = a%b
        //3. (-a)%b = -(a%b)
        //eg. (-39)%(-10) = (-39)%10 = -(39%10) = -9
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b =sc.nextInt();
        System.out.println(a%b);
    }
}
