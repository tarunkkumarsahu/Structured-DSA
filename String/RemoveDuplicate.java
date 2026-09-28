//Q10Remove duplicate character from a string

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(result.indexOf(ch) == -1){
                result = result + ch;
            }
        }

        System.out.print(result);
    }
}
