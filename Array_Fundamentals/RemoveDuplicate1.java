/* 
Q13.2 - Now we are working for the unsorted array 
*/

import java.util.*;

public class RemoveDuplicate1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " +size+" elements: ");
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your arrya is: ");
        
        for(int j = 0 ; j < arr.length ; j ++){

            boolean Duplicate = false;

            for(int k = 0 ; k < j ; k++){
                if(arr[j] == arr[k]){
                    Duplicate = true;
                    break;
                }
                
            }
            if(!Duplicate){
                System.out.print(arr[j] + " ");
            }
        }
    }
}