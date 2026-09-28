// Q8 - Remove all space from a string 
import java.util.*;

public class RemoveAllSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Your string become: ");
        
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            System.out.print(ch);
        }

    }
}