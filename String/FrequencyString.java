// Q6 - Count Frequency of given string
import java.util.*;

public class FrequencyString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char cha = sc.next().charAt(0);

        int count = 0;

        System.out.print("Frequency of "+cha+ " is: ");

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == cha){
                count++;
            }
        }
        System.out.print(count);

        sc.close();
    }
}