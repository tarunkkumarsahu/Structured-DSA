// Q2 - Given a String, count how many character it contains without using length()
// Q2.1 - count vowels in a string 


import java.util.*;

public class CountVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String str = sc.nextLine();

        int count = 0 ;

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
             
            if(ch == 'a'|| ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'u'
            ){
                count++;
            }  
        }

        System.out.print("Numbe of vowels: " + count);
    }
}