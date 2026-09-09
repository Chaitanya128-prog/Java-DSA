package if_else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Value = sc.nextInt();
        if(Value<0){
            System.out.println((Value)*-1);  //or we can simply write(-Value)
        }
        else{
            System.out.println(Value);
        }
    }
}
//if(n<0) {n=-n;}
//sout(n)

