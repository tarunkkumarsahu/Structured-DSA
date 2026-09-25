import java.util.*;

public class AAFormat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

       
    }
}
