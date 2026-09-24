// Q14 - Move all zeros to the end of an array
import java.util.*;


public class MoveAllZeroToEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your array is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

       // Move zeros to the end
        int i = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        // Print modified array
        System.out.print("Array after moving zeros: ");

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        sc.close();
    }
}