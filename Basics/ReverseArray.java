// question 4


import java.util.*;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " Element: ");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Reversed Array: ");

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}