// Q11 - Find an Element's Index in an Array
import java.util.*;

public class FindIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int index = -1 ;

        for(int j = 0 ; j < arr.length ; j++){
            if(target == arr[j]){
                index = j;
                break;
            }
        }

        if(index == -1){
            System.out.print("Element not found");
        }
        else {
            System.out.print("Element found at index: "+ index);
        }
    }
}