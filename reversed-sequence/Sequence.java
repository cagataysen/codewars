public class Sequence{

    public static int[] reverse(int n){
        int[] myArray = new int[n];
        for(int i = n; i > 0; i--){
            myArray[n-i] = i;
        }
        return myArray;
    }

}