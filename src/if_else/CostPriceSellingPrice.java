package if_else;

import java.util.Scanner;

public class CostPriceSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selling Price: ");
        int SP = sc.nextInt();
        System.out.println("Enter the Cost price: ");
        int CP = sc.nextInt();

//        if(SP>CP ) System.out.println("Profit"+((double)(SP-CP)/CP)*100);
//     else System.out.println("Loss");
//        if(CP>SP) System.out.println("loss"+(CP-SP));
//        if(SP==CP) System.out.println("No profit Noloss");


        if(SP>CP ) System.out.println("Profit"+((double)(SP-CP)/CP)*100);
//        else System.out.println("Loss");
        else if(CP>SP) System.out.println("loss"+(CP-SP));
        else System.out.println("No profit Noloss");
    }
}
