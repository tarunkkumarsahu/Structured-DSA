// Q19 - Rotate an array by k Position 

import java.util.*;

public class RotateAnArrayByK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        if (arr.length > 0) {

            k = k % arr.length;

            for (int j = 0; j < k; j++) {

                int first = arr[0];

                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                arr[arr.length - 1] = first;
            }
        }

        System.out.print("Rotated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
        
    }
}
