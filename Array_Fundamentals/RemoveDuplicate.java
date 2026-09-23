// Q13 - Remove Duplicate from a sorted array 
import java.util.*;


public class RemoveDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;
        
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[i]  != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        int uniqueCount = i + 1;

        for(int k = 0 ; k < uniqueCount ; k++){
            System.out.print(arr[k] + " ");
        }
    }
}

/*  now remember this is for the sorted array 
so we use only sorted array 
*/