// Q10 - Check if an Array is shoted 

import java.util.*;

public class CheckSorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        boolean sorted = true ;

        for(int j = 1 ; j < arr.length ; j++){
            if(arr[j] < arr[j-1]){
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        sc.close();
       
    }
}