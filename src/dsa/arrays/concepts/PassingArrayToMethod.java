package dsa.arrays.concepts;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {2,45,67,89,9};
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[] y){
        y[2] = 99;
    }
}
