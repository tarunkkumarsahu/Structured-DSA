public class LinearSearch{
    public static void main(String[] args){

        int[] arr = {5, 8, 2, 7, 3};
        int target = 7;

        int index = -1;

        for ( int i = 0 ; i < arr.length ; i++){

            if (arr[i] == target){
                index = i;
                break;
            }
        }

        System.out.print(index);

    }
}