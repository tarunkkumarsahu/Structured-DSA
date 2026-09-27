// Q4 = write a java program that takes a string as input and print string in reverse order
import java.util.*;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        
        System.out.print("Reverse String is: ");
        for(int i = str.length() - 1 ; i >= 0  ; i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }

    }
}