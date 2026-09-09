package if_else;

import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        if(x==0 && y==0) System.out.println("Origin");
        else if(x>0 && y==0) System.out.println("X axis");
        else if(x==0 && y>0) System.out.println("Y axis");
        else if(x>0 && y>0) System.out.println("Quardrant 1");
        else if(x<0 && y>0) System.out.println("Quardrant 2");
        else if(x<0 && y<0) System.out.println("Quardrant 3");
        else if(x>0 && y<0) System.out.println("Quardrant 4");


    }
}
