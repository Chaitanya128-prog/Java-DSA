package dsa.arrays.concepts;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        //sort-ascending order mein kr dena
        int[] arr = {-2,33,-78,-56,45,34};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
