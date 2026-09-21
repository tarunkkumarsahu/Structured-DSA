// Question 1


public class Array{
    public static void main(String[] args){

        int[] arr = {7, 4, 9, 2, 6};

        int minimum = arr[0];

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        System.out.print(minimum);
    }
}