// Palindrome String 
import java.util.*;

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        for(int i = str.length() - 1 ; i >= 0 ; i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}