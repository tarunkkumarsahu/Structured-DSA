// Q9 Convert Lowercase character to uppercase character 
// condition do not use toLowerCase() or toUpperCase()

import java.util.*;

public class ConvertUPtoLC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            System.out.print(ch);
        }
    }
}
