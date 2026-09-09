package if_else;
import java.util.Scanner;
public class IntOrNot {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = sc.nextDouble();
        int n = (int)x;
        if (x-n > 0 ){
            System.out.println("Not an integer");
        }
        else {
            System.out.println("integer");
        }
    }
}
