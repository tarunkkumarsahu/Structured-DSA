// Q17 - Second smallest number in an array 

import java.util.*;

public class SecondSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Second smallest distinct element not found.");
            sc.close();
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Your input is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest distinct element not found.");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }

    }
}
