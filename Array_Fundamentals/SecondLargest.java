// question 6 - find the second largest elements 

import java.util.*;

public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Second largest distinct element not found.");
            sc.close();
            return;
        }
        
        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for(int j = 1; j < arr.length ; j++){
            if(arr[j]>largest){
                largest = arr[j];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != largest && (!found || arr[i] > secondLargest)){
                secondLargest = arr[i];
                found = true; 
            }
        }
        if(found){
            System.out.println("Second largest: "+ secondLargest);
        } else{
            System.out.println("No second largest distinct element.;");
        }

        sc.close();
    }
}

// solving without using boolean expression 

/*
int secondLargest = 0;

for(int i = 0 ; i < arr.length ; i++){
    if(arr[i] != largest && arr[i] > secondLargest){
        secondLargest = arr[i];
    }
}

System.out.println("Largest: " + largest);
System.out.println("Second largest: " + secondLargest);

*/


/*
if (arr[i] != largest) {
    if (arr[i] > secondLargest) {
        secondLargest = arr[i];
    }
}

System.out.println("Largest: " + largest);
System.out.println("Second largest: " + secondLargest);

*/