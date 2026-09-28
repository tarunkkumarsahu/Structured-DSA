public class Main2{
    public static void main(String[] args){
          
        int num = 12321;

        int temp = num ;
        int rev = 0 ;

        while(num > 0){
            int digit = num % 10 ;
            rev = rev  * 10 + digit;
            num = num / 10;
        }

        if(temp == rev){
            System.out.print("Number is Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}