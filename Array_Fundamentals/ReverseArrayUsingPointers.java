// q12- Reverse an Array usign two pointers 
import java.util.*;
public class ReverseArrayUsingPointers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+ size +" element: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Your Array is: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int left = 0;
        int right = arr.length - 1;

        while(left < right ){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }
        System.out.print("Reverse Array is: ");

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}