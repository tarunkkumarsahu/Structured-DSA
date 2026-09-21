//question 5

import java.util.*;

public class CountEvenAndOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");

        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        sc.close();
        
    }
}