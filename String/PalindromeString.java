// Q5 - Check whether a String is a Palindrome

import java.util.*;

public class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }

        sc.close();
    }
}