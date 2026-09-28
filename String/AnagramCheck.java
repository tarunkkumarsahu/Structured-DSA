// Q12 - Check if two strings are anagrams

import java.util.*;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams.");
            sc.close();
            return;
        }

        boolean isAnagram = true;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch) {
                    count1++;
                }

                if (str2.charAt(j) == ch) {
                    count2++;
                }
            }

            if (count1 != count2) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }

        sc.close();
    }
}