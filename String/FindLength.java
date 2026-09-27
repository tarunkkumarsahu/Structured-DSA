// Q1 - Write the java program that takes a string as input and finds its length 

import java.util.*;

public class FindLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String str = sc.nextLine();

        System.out.print("The length of the string is: ");
        System.out.print(str.length());

        sc.close();
    }
}