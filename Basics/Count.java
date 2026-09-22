// Q8- Count positive, negative and zero elements 
import java.util.*;

public class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        int Positive = 0;
        int Negative = 0;
        int Zero = 0;

        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] > 0){
                Positive++;
            }
            else if(arr[j] == 0){
                Zero++;
            }
            else{
                Negative++;
            }
        }

        System.out.println("Positive Number: "+Positive);
        System.out.println("Negative Number: "+Negative);
        System.out.println("Zero: "+Zero);
    }
}