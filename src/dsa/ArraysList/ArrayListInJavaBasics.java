package dsa.ArraysList;

import java.util.ArrayList;

public class ArrayListInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));  //arr[2]
        arr.set(3,50);   //arr[3]=50

        System.out.println(arr);

//        int n = arr.size();
//        for(int i = 0;i<arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
//        System.out.println();
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        arr.add(78);
//        arr.add(1,100);
//        arr.remove(arr.size()-1);
//        Collections.reverse(arr);
//        System.out.println(arr);
        int i = 0 , j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j, temp);
            i++;
            j--;

        }
        System.out.println(arr);
    }
}
