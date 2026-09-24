// Q16 - rotate array by right 
import java.util.*;

public class RotateArrayByRight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+ size + " elements: ");
        for(int i = 0 ; i < size ; i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your input is: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        if(arr.length > 1){
            int last = arr[arr.length - 1];

            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = arr[i-1];
            }

            arr[0] = last;
        }

        System.out.print("Your Rotated Array is: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}