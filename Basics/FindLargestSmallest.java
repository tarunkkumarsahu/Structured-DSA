// Q9 - Find largest and smallest elements in an array 
import java.util.*;

public class FindLargestSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];

        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] > largest ){
                largest = arr[j];
            }
        }

        int smallest = arr[0];

        for(int k = 0 ; k < arr.length ; k++){
            if(arr[k]<smallest){
                smallest = arr[k];
            }
        }

        System.out.print("Largest: "+largest );
        System.out.print("Smallest: "+smallest);
       
    }
}