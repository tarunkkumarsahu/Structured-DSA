//q7- find the frequency of the array
import java.util.*;

public class FrequencyOfArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target number: ");
        int target = sc.nextInt();

        int count = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                count++;
            }
        }

        System.out.println("Frequency of "+targegt+ ": "+count);

        sc.close();
    }
}