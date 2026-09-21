// question 3

import java.util.*;

public class ArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+ size + " element: ");

        for(int i = 0; i < size ; i++ ){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int j = 0 ; j < size ; j++){
            sum = sum + arr[j];
        }

        System.out.print("Sum of array: " + sum);

    }
}