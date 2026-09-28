// Q7 - Count number of words in a string 
import java.util.*;

public class CountWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int count = 0;
        boolean inWord = false;

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                if(!inWord){
                    count++;
                    inWord = true;
                }
            }
            else{
                inWord = false;
            }
        }
        System.out.print("Number of words: "+count);

        sc.close();
    }
}