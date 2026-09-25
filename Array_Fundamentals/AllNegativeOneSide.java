// Q18 - All Negative
import java.util.*;

public class AllNegativeOneSide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        int pos = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;

                pos++;
            }
        }

        System.out.print("Your Array is: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}